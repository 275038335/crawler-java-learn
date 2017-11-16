package com.chinaredstar.jc.crawler.controller;

import com.chinaredstar.jc.crawler.biz.test.CompanyProcessor;
import com.chinaredstar.jc.crawler.biz.test.TaoBaoPageProcessor;
import com.chinaredstar.jc.crawler.biz.test.chrome.TestChromeDriverProcessor;
import com.chinaredstar.jc.crawler.biz.test.phantomjs.TestPhantomJsPageProcessor;
import com.chinaredstar.jc.crawler.biz.test.taobao.TestExtendTaoBaoPageProcessor;
import com.chinaredstar.jc.crawler.biz.test.taobao.TestTaoBaoPageProcessor;
import com.chinaredstar.jc.rsv.vo.RestResultVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.HttpClientDownloader;

/**
 * Created by lenovo on 2017/11/13.
 */
@RestController
@RequestMapping("/taobao")
public class TaoBaoController {

    @RequestMapping("/test")
    public RestResultVo test(){
        Spider spider=Spider.create(new TaoBaoPageProcessor());
        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
        spider.setDownloader(httpClientDownloader);
        spider.addUrl("https://detail.tmall.com/item.htm?id=534681858147").thread(1).run();
        return null;
    }

    @RequestMapping("/testChromeDriver")
    public RestResultVo testChromeDriver(){
        Spider spider=Spider.create(new TestChromeDriverProcessor());
        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
        spider.setDownloader(httpClientDownloader);
        spider.addUrl("https://detail.tmall.com/item.htm?id=534681858147").thread(1).run();
        return null;
    }


    @RequestMapping("/testPhantomJs")
    public RestResultVo testPhantomJs(){
        Spider spider=Spider.create(new TestPhantomJsPageProcessor());
        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
        spider.setDownloader(httpClientDownloader);
        spider.addUrl("https://detail.tmall.com/item.htm?id=534681858147").thread(1).run();
        return null;
    }

    @RequestMapping("/testTaoBaoSearch")
    public RestResultVo testTaoBaoSearch(String keyWord){
        Spider spider=Spider.create(new TestTaoBaoPageProcessor(keyWord));
        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
        //免费代理不稳定老挂
//        httpClientDownloader.setProxyProvider(SimpleProxyProvider.from(new Proxy("27.219.38.130",8118)));
        spider.setDownloader(httpClientDownloader);
        spider.addUrl("https://s.taobao.com/search?q="+keyWord).thread(1).run();
        return null;
    }

    @RequestMapping("/testExtendSearch")
    public RestResultVo testExtendSearch(String keyWord){
        Spider spider= Spider.create(new TestExtendTaoBaoPageProcessor(keyWord));
        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
//        httpClientDownloader.setProxyProvider(SimpleProxyProvider.from(new Proxy("27.219.38.130",8118)));
        spider.setDownloader(httpClientDownloader);
        spider.addUrl("https://s.taobao.com/search?q="+keyWord).thread(10).run();
        return null;
    }

    @RequestMapping("/test1")
    public void test1(){
        Spider.create(new CompanyProcessor())
                .addUrl("http://www.sse.com.cn/assortment/stock/list/info/company/index.shtml?COMPANY_CODE=600000")
                .thread(5)
                .run();
    }
}
