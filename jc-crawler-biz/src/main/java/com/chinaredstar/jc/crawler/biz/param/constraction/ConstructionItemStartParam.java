package com.chinaredstar.jc.crawler.biz.param.constraction;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

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
public class ConstructionItemStartParam {

    @NotNull(message = "is null error")
    @Min(value = 1, message = "min is 1")
    private Integer id;

    @NotNull(message = "is null error")
    private Date realStartTime;

    @Length(max = 300, message = "max length is 300")
    private String startInfo;

    @Size(max = 6, message = "max size is 6")
    private List<String> startPicList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRealStartTime() {
        return realStartTime;
    }

    public void setRealStartTime(Date realStartTime) {
        this.realStartTime = realStartTime;
    }

    public String getStartInfo() {
        return startInfo;
    }

    public void setStartInfo(String startInfo) {
        this.startInfo = startInfo;
    }

    public List<String> getStartPicList() {
        return startPicList;
    }

    public void setStartPicList(List<String> startPicList) {
        this.startPicList = startPicList;
    }
}
