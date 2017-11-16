package com.chinaredstar.jc.crawler.biz.test;

import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.model.ConsolePageModelPipeline;
import us.codecraft.webmagic.model.OOSpider;
import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.HelpUrl;
import us.codecraft.webmagic.model.annotation.TargetUrl;

/**
 * 使用注解尝试失败
 * @author zhuangj
 * @date 2017/11/13
 */
//@TargetUrl("https://detail.tmall.com/item.htm?id=\\*")
@TargetUrl("https://detail.tmall.com/item.htm?id=534681858147")
@HelpUrl("https://s.taobao.com/search/\\w+")
public class TaoBaoItem {

    @ExtractBy("//*[@id=\"J_DetailMeta\"]/div[1]/div[1]/div/div[1]/h1")
    private String name;

    @ExtractBy("//*[@id=\"J_StrPriceModBox\"]/dd/span")
    private String price;

    @ExtractBy("//*[@id=\"shopExtra\"]/div[1]/a/strong")
    private String shopName;

    private String parameter;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getShopName() {
        return shopName;
    }

    public String getParameter() {
        return parameter;
    }

    public static void main(String[] args) {
        OOSpider.create(Site.me().setSleepTime(1000), new ConsolePageModelPipeline(), TaoBaoItem.class)
                .addUrl("https://detail.tmall.com/item.htm?id=534681858147").thread(5).run();
    }
}
