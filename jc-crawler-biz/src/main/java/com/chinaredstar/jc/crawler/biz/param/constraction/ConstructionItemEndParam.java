package com.chinaredstar.jc.crawler.biz.param.constraction;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: fangjian<jian.fang@chinaredstar.com>
 * @date: Create in 10:13 2017/9/26
 * @modified by:
 */
public class ConstructionItemEndParam {

    @NotNull(message = "is null error")
    @Min(value = 1, message = "min is 1")
    private Integer id;

    @NotNull(message = "is null error")
    private Date realEndTime;

    @Length(max = 300, message = "max length is 300")
    private String endInfo;

    @Size(max = 6, message = "max size is 6")
    private List<String> endPicList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRealEndTime() {
        return realEndTime;
    }

    public void setRealEndTime(Date realEndTime) {
        this.realEndTime = realEndTime;
    }

    public String getEndInfo() {
        return endInfo;
    }

    public void setEndInfo(String endInfo) {
        this.endInfo = endInfo;
    }

    public List<String> getEndPicList() {
        return endPicList;
    }

    public void setEndPicList(List<String> endPicList) {
        this.endPicList = endPicList;
    }
}
