package com.chinaredstar.jc.crawler.common.util;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合工具类
 * Created by zhuangj on 2017/3/28.
 */
public class CollectionsUtils {

    private static Logger logger = LoggerFactory.getLogger(CollectionsUtils.class);

    public static List BeanCopyList(List sources, Class target) {

        try {
            List list = new ArrayList();
            //如果入参为空，则不进行处理
            if(CollectionUtils.isEmpty(sources)){
                return  list;
            }
            //拷贝
            for (Object source : sources) {
                Object obj = target.newInstance();
                BeanUtils.copyProperties(source, obj);
                list.add(obj);
            }
            return list;
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new RuntimeException("集合BeanCopy异常");
        }
    }




}
