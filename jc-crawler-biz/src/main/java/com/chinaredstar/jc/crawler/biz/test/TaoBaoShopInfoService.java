package com.chinaredstar.jc.crawler.biz.test;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuangj on 2017/11/13.
 */
@Service
public class TaoBaoShopInfoService {
    
    private List<String> shopUrl=new ArrayList<>();

    public void emptyTable() {
        shopUrl = new ArrayList<>();
        shopUrl.add("https://detail.tmall.com/item.htm?spm=a220o.1000855.w14210285-15380483108.1.5c90c348OtrgGp&id=535458196420&skuId=3430182564930&scene=taobao_shop&ali_trackid=42_abea91f3d19396d9aa5a80387392eb63");
    }

    public List<String> getShopUrl() {
        return shopUrl;
    }
}
