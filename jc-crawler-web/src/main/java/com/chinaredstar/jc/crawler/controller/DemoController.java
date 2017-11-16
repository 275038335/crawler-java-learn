package com.chinaredstar.jc.crawler.controller;

import com.chinaredstar.jc.rsv.vo.RestResultVo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.processor.example.GithubRepoPageProcessor;
import us.codecraft.webmagic.proxy.Proxy;
import us.codecraft.webmagic.proxy.SimpleProxyProvider;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/10/30.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {


    @RequestMapping("/test")
    public RestResultVo test(){
        Spider spider=Spider.create(new GithubRepoPageProcessor());
        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
        httpClientDownloader.setProxyProvider(SimpleProxyProvider.from(new Proxy("119.29.158.87",80)));
        spider.setDownloader(httpClientDownloader);
        spider.addUrl("https://search.jd.com/Search?keyword=%E4%B8%9C%E9%B9%8F%E7%93%B7%E7%A0%96&enc=utf-8&wq=%E4%B8%9C%E9%B9%8Fcizhuan&pvid=15e8484e950248058483b22663b98353").thread(5).run();
        return null;
    }
}
