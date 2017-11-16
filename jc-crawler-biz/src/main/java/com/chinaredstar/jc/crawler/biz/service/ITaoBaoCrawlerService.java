package com.chinaredstar.jc.crawler.biz.service;

import com.chinaredstar.jc.crawler.dao.po.taobao.TaoBaoPo;

/**
 * 淘宝爬虫服务类
 * @author zhuangj
 * @date 2017/11/15
 */
public interface ITaoBaoCrawlerService {
    /**
     * 保存项目项目
     * @param po
     */
    void saveProductDetail(TaoBaoPo po);
}
