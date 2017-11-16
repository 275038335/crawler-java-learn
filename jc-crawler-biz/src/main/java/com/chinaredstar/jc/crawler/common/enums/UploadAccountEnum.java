package com.chinaredstar.jc.crawler.common.enums;

/**
 * 上传账号枚举
 * Created by fangjian on 2016/11/24.
 */
public enum UploadAccountEnum {


    UPLOAD_ACCOUNT_PROD("prod"),
    UPLOAD_ACCOUNT_STG("stg"),
    UPLOAD_ACCOUNT_UAT("uat"),
    UPLOAD_ACCOUNT_UAT1("uat1"),
    UPLOAD_ACCOUNT_DEV("dev");


    private String tag;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    UploadAccountEnum(String tag) {
        this.tag = tag;
    }
}
