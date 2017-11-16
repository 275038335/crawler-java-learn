package com.chinaredstar.jc.crawler.proxy.common.enums;

/**
 * C端proxy code
 * Created by fangjian on 2016/11/7.
 */
public enum JcCrawlerProxyCodeEnum {

    THROW_EXCEPTION(2000, "proxy exception"),
    RETURN_FAILED(2001, "proxy 调用接口返回失败"),
    RETURN_NULL(2002, "proxy 调用接口返回null"),
    PARAMS_ERROR(4000, "proxy 参数错误"),


    crawler_API_ERROR(-1, "微信api放回的错误"),//code msg 会在业务覆盖成微信的

    UNKNOWN_ERROR(9999, "proxy 未知异常"),

    ILLEGAL_OPT(8888, "非法请求"),

    /****
     *  业务异常在后面定义
     */

    ;

    JcCrawlerProxyCodeEnum(int code, String desc) {
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

    public void setCode(int code) {
        this.code = code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
