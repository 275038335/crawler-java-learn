package com.chinaredstar.jc.crawler.biz.test.taobao;

import com.chinaredstar.jc.crawler.biz.service.ITaoBaoCrawlerService;
import com.chinaredstar.jc.crawler.biz.service.impl.TaoBaoCrawlerServiceImpl;
import com.chinaredstar.jc.crawler.biz.test.extend.RequestExtend;
import com.chinaredstar.jc.crawler.biz.test.phantomjs.TestPhantomJsDriver;
import com.chinaredstar.jc.crawler.common.util.BeanUtil;
import com.chinaredstar.jc.crawler.dao.po.taobao.TaoBaoPo;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author zhuangj
 * @date 2017/11/13
 */
public class TestExtendTaoBaoPageProcessor implements PageProcessor {

    private String keyWord;

    private static final String TAO_BAO_SEARCH_URL_START="https://s.taobao.com/search";

    private static final String TAO_BAO_DETAIL_URL_START="https://item.taobao.com/item.htm";

    private static final String TIAN_MAO_SEARCH_URL_START="https://list.tmall.com/search_product.htm";

    private static final String TIAN_MAO_DETAIL_URL_START="https://detail.tmall.com/item.htm";

    private ITaoBaoCrawlerService taoBaoCrawlerService=getTaoBaoCrawlerServiceBean();

    private Site site = Site
            .me()
            .setCharset("UTF-8")
            .setCycleRetryTimes(3)
            .setSleepTime(3 * 1000)
            .addHeader("Connection", "keep-alive")
            .addHeader("Cache-Control", "max-age=0")
            .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0");


    /**
     * 使用chromeDriver程序正常运行,转换成PhtanomJs后发现查询到的数据不是想要的数据，复制HTML查看页面后,
     * 发现搜索的数据是错乱的,搜索框上显示着？？？，猜测是转码的问题，经过URLEncode之后，程序正常运行。
     * @return
     */
    public String getKeyWord() {
        try {
            return URLEncoder.encode(keyWord,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return StringUtils.EMPTY;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public TestExtendTaoBaoPageProcessor() {
    }

    public TestExtendTaoBaoPageProcessor(String keyWord) {
        this.keyWord = keyWord;
    }

    @Override
    public Site getSite() {
        return site;
    }




    @Override
    public void process(Page page) {
        WebDriver driver= TestPhantomJsDriver.getPhantomJSDriver();
        try {
            driver.get(page.getRequest().getUrl());
            WebElement webElement = driver.findElement(By.id("page"));
            String str = webElement.getAttribute("outerHTML");

            Html html = new Html(str);
            if(isFirstPage(html)){
                analysisPagination(page,html);
            }else if(isListPage(html)){
                analysisListPage(page,html,driver);
            }else {
                analysisDetailPage(page,html,driver);
            }
            driver.quit();
        }finally{
            if(driver!=null){
                driver.quit();
            }
        }
    }

    private void analysisListPage(Page page, Html html, WebDriver driver) {
        RequestExtend requestExtend= (RequestExtend) page.getRequest();
        System.out.println("parentUrl:"+requestExtend.getParentUrl());
        System.out.println("nowUrl:"+page.getUrl());
        List<String> detailPageList= html.xpath("//*[@id=\"mainsrp-itemlist\"]").$("a[id^='J_Itemlist_TLink_']").xpath("//a/@href").all();
        for(String deetailPage:detailPageList){
            RequestExtend extend=new RequestExtend("https:"+deetailPage,page.getUrl().toString());
            page.addTargetRequest(extend);
        }
    }

    /**
     * 分析分页规则
     * @param page
     * @param html
     */
    private void analysisPagination(Page page,Html html){
        List<String> pageList= html.xpath("//*[@id=\"mainsrp-pager\"]/div/div/div/ul/li/a/@data-value").all();
        pageList = new ArrayList(new HashSet(pageList));

        List<String> pageParameterList=new ArrayList<>();
        for(String  value:pageList){
            RequestExtend extend=new RequestExtend("https://s.taobao.com/search?q="+getKeyWord()+"&s="+value,page.getUrl().toString());
            page.addTargetRequest(extend);
        }
        page.addTargetRequests(pageParameterList);
    }

    /**
     * 分析详情页
     * @param page
     * @param html
     * @param driver
     */
    private void analysisDetailPage(Page page,Html html,WebDriver driver){
       String url=page.getUrl().toString();
        if(url.startsWith(TAO_BAO_DETAIL_URL_START)){
            analysisTaoBaoDetailPage(page,html,driver);
        }else if(url.startsWith(TIAN_MAO_DETAIL_URL_START)){
            analysisTianMaoDetailPage(page,html,driver);
        }
    }

    /**
     * 分析淘宝详情页
     * @param page
     * @param html
     * @param driver
     */
    private void analysisTaoBaoDetailPage(Page page,Html html,WebDriver driver){
        RequestExtend requestExtend= (RequestExtend) page.getRequest();
        System.out.println("parentUrl:"+requestExtend.getParentUrl());
        System.out.println("nowUrl:"+page.getUrl());
        page.putField("price", html.xpath("//[@id=\"J_StrPrice\"]/em[2]/text()").toString());
        String shopName=html.xpath("//*[@id=\"J_ShopInfo\"]/div/div[1]/div[1]/dl/dd/strong/a/text()").toString();
        if(StringUtils.isBlank(shopName)){
            shopName=html.xpath("//*[@id=\"header-content\"]/div[2]/div[1]/div[1]/a/text()").toString();
        }
        page.putField("shopName", shopName);
        page.putField("title", html.xpath("////*[@id=\"J_Title\"]/h3/text()").toString());

        TaoBaoPo po=new TaoBaoPo();
        po.setParentUrl(requestExtend.getParentUrl());
        po.setPrice(page.getResultItems().get("price"));
        po.setShopName(page.getResultItems().get("shopName"));
        po.setTitle(page.getResultItems().get("title"));
        po.setUrl(page.getUrl().toString());
        taoBaoCrawlerService.saveProductDetail(po);
    }

    /**
     * 分析天猫详情页
     * @param page
     * @param html
     * @param driver
     */
    private void analysisTianMaoDetailPage(Page page,Html html,WebDriver driver){
        RequestExtend requestExtend= (RequestExtend) page.getRequest();
        System.out.println("parentUrl:"+requestExtend.getParentUrl());
        System.out.println("nowUrl:"+page.getUrl());
        page.putField("price", html.xpath("//[@id=\"J_StrPriceModBox\"]/dd/span/text()").toString());
        page.putField("shopName", driver.findElement(By.name("seller_nickname")).getAttribute("value"));
        page.putField("title", html.xpath("//[@id=\"J_DetailMeta\"]/div[1]/div[1]/div/div[1]/h1/text()").toString());

        TaoBaoPo po=new TaoBaoPo();
        po.setParentUrl(requestExtend.getParentUrl());
        po.setPrice(page.getResultItems().get("price"));
        po.setShopName(page.getResultItems().get("shopName"));
        po.setTitle(page.getResultItems().get("title"));
        po.setUrl(page.getUrl().toString());
        taoBaoCrawlerService.saveProductDetail(po);
    }



    /**
     * 是否为列表页
     * @param html
     * @return
     */
    private boolean isListPage(Html html) {
        String tmp = html.$("#mainsrp-pager").get();
        if (StringUtils.isNotBlank(tmp)) {
            return true;
        }
        return false;
    }

    /**
     * 列表页获取当前页码
     * @param html
     * @return
     */
    private String getCurrentPageNo(Html html){
        return html.xpath("//*[@id=\"mainsrp-pager\"]/div/div/div/ul/li[contains(@class,'active')]/span/text()").toString();
    }

    /**
     * 判断是否列表页的第一页
     * @param html
     * @return
     */
    private Boolean isFirstPage(Html html){
        return isListPage(html)&&getCurrentPageNo(html).equals("1");
    }

    /**
     * 获取淘宝bean
     * @return
     */
    private TaoBaoCrawlerServiceImpl getTaoBaoCrawlerServiceBean(){
        return BeanUtil.getBean(TaoBaoCrawlerServiceImpl.class);
    }


}
