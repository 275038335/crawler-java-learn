package com.chinaredstar.jc.crawler.biz.test.phantomjs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

/**
 *
 * @author zhuangj
 * @date 2017/11/13
 */
public class TestPhantomJsPageProcessor implements PageProcessor {

    private static WebDriver driver;



    public TestPhantomJsPageProcessor() {
    }

    static {
        System.setProperty("webdriver.chrome.driver","C:/Users/sunlc/AppData/Local/Google/Chrome/Application/chrome.exe");
        System.setProperty("phantomjs.binary.path", "D:\\chromedriver\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
    }

    private Site site = Site
            .me()
            .setCharset("UTF-8")
            .setCycleRetryTimes(3)
            .setSleepTime(3 * 1000)
            .addHeader("Connection", "keep-alive")
            .addHeader("Cache-Control", "max-age=0")
            .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0");

    @Override
    public void process(Page page) {

        driver= TestPhantomJsDriver.getPhantomJSDriver();
        driver.get("https://detail.tmall.com/item.htm?id=534681858147");
        WebElement webElement = driver.findElement(By.id("page"));
        String str = webElement.getAttribute("outerHTML");

        Html html = new Html(str);



        page.addTargetRequests(html.links().regex("(https://detail.tmall.com/item.htm?id=\\\\*)").all());
        page.putField("price", html.xpath("//[@id=\"J_StrPriceModBox\"]/dd/span/text()").toString());

        page.putField("shopName", driver.findElement(By.name("seller_nickname")).getAttribute("value"));
        page.putField("name", html.xpath("//[@id=\"J_DetailMeta\"]/div[1]/div[1]/div/div[1]/h1/text()").toString());
    }

    @Override
    public Site getSite() {
        return site;
    }



}
