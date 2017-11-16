package com.chinaredstar.jc.crawler.biz.param.constraction;


import org.hibernate.validator.constraints.NotBlank;

/**
 * @description:
 * @author: fangjian<jian.fang@chinaredstar.com>
 * @date: Create in 10:13 2017/9/26
 * @modified by:
 */
public class QueryConstructionDetailParam {

    @NotBlank(message = "is null error")
    private String constructionCode;

    public String getConstructionCode() {
        return constructionCode;
    }

    public void setConstructionCode(String constructionCode) {
        this.constructionCode = constructionCode;
    }


}
