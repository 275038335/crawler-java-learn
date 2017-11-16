package com.chinaredstar.jc.crawler.common.util;

import java.util.Date;

/**
 * @description:
 * @author: fangjian<jian.fang@chinaredstar.com>
 * @date: Create in 13:43 2017/9/27
 * @modified by:
 */
public class BizUtils {


    /**
     * @param date1 开始时间
     * @param date2 结束时间
     * @description: 判断两个短日期的间隔天数
     * @author: chaoyue
     * @return:
     * @date: Create in 14:00 2017/9/26
     * @modified by:
     */
    public static int differentDays(Date date1, Date date2) {
        int days = (int) ((date2.getTime() - date1.getTime()) / (1000 * 3600 * 24));
        return days;
    }


}
