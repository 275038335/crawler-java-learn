package com.chinaredstar.jc.crawler.biz.service.impl;

import com.chinaredstar.jc.crawler.biz.service.ITaoBaoCrawlerService;
import com.chinaredstar.jc.crawler.dao.mapper.TaoBaoCrawlerMapper;
import com.chinaredstar.jc.crawler.dao.po.taobao.TaoBaoPo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 * @author lenovo
 * @date 2017/11/15
 */
@Service
public class TaoBaoCrawlerServiceImpl implements ITaoBaoCrawlerService {

    @Resource
    private TaoBaoCrawlerMapper taoBaoCrawlerMapper;


    @Override
    public void saveProductDetail(TaoBaoPo po) {
        taoBaoCrawlerMapper.saveTaoBao(po);
    }
}
