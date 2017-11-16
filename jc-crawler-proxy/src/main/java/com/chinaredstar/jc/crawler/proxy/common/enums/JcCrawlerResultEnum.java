package com.chinaredstar.jc.crawler.proxy.common.enums;

/**
 * @description:
 * @author: chaoyue<chaoyue.fan@chinaredstar.com>
 * @date: Create in 10:01 2017/9/21
 * @modified by:
 */
public enum JcCrawlerResultEnum {

     crawler_RESULT_SUCCESS(0, "Success"),
     crawler_RESULT_SYSTEM_BUSY(-1, "系统繁忙")

    ;

    JcCrawlerResultEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private int code;
    private String desc;

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
