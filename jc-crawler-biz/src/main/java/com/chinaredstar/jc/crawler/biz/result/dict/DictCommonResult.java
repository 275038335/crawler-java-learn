package com.chinaredstar.jc.crawler.biz.result.dict;


import java.util.List;

/**
 * 字典公用结果类
 * Created by zhuangj on 2017/8/17.
 */
public class DictCommonResult {

    //编码
    private String code;

    //描述
    private String desc;

    //级联条件
    private List<DictCommonResult> cascader;

    //子类查询
    private List<DictCommonResult> children;

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

    public List<DictCommonResult> getCascader() {
        return cascader;
    }

    public void setCascader(List<DictCommonResult> cascader) {
        this.cascader = cascader;
    }

    public List<DictCommonResult> getChildren() {
        return children;
    }

    public void setChildren(List<DictCommonResult> children) {
        this.children = children;
    }
}
