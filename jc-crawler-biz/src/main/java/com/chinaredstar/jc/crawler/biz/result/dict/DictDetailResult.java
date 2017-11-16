package com.chinaredstar.jc.crawler.biz.result.dict;

import java.io.Serializable;

/**
 * 字典详情结果对象
 * Created by fangjian on 2017/8/2.
 */
public class DictDetailResult implements Serializable {

    private static final long serialVersionUID = -7579650882468702658L;
    private String code;

    private String desc;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
