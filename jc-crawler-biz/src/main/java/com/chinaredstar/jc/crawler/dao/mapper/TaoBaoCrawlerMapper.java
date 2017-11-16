package com.chinaredstar.jc.crawler.dao.mapper;

import com.chinaredstar.jc.crawler.dao.po.taobao.TaoBaoPo;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author zhuangj
 * @date 2017/11/15
 */
public interface TaoBaoCrawlerMapper {

    void saveTaoBao(@Param("po") TaoBaoPo po);
}
