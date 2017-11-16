package com.chinaredstar.jc.crawler.common.util;

import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 数字类型工具类
 * Created by zhuangj on 2017/8/21.
 */
public class NumUtil {

    /**
     * 分转元方法类
     *
     * @param price
     * @return
     */
    public static Integer convertCentToYuan(Integer price) {
        return price == null ? price : price / 100;
    }


    /**
     * 分转元方法类
     *
     * @param price
     * @return
     */
    public static BigDecimal convertCentToYuan(BigDecimal price) {
        if(price==null){
            return new BigDecimal(0);
        }
        return price.divide(new BigDecimal(100),2,BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 比例转换为百分比
     *
     * @param proportion
     * @param defaultValue 比例为空的默认值
     * @return
     */
    public static String convertToPercentage(Object proportion, String defaultValue) {
        return proportion == null ? defaultValue : proportion.toString() + "%";
    }

    /**
     * 比例转换默认为空值符串
     *
     * @param proportion
     * @return
     */
    public static String convertToPercentageDefault(Object proportion) {
        return convertToPercentage(proportion, StringUtils.EMPTY);
    }


    /**
     * // 判断小数点后2位的数字的正则表达式
     *
     * @param str
     * @return true 符合，false不符合
     */
    public static boolean isNumber2(String str) {
        Pattern pattern = Pattern.compile("^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,2})?$");
        Matcher match = pattern.matcher(str);
        if (match.matches() == false) {
            return false;
        } else {
            return true;
        }
    }


}
