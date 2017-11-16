package com.chinaredstar.jc.crawler.common.enums.construction;

/**
 * 施工项状态枚举类 0:待开工,1:已开工,2:已完工
 * Created by fangjian on 2017/9/27.
 */
public enum ConstructionItemStateEnum {
    WAIT(0, "待开工"),
    ING(1, "已开工"),
    DOWN(2, "已完工");

    ConstructionItemStateEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    private Integer code;
    private String value;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }
}
