package com.chinaredstar.jc.crawler.biz.result.constraction;

import java.util.Date;

/**
 * @description:
 * @author: fangjian<jian.fang@chinaredstar.com>
 * @date: Create in 10:13 2017/9/26
 * @modified by:
 */
public class ConstructionItemListResult {

    private Integer id;

    private String content;

    private Date planStartTime;

    private Date planEndTime;

    private Integer state;

    private Integer isDelayEnd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPlanStartTime() {
        return planStartTime;
    }

    public void setPlanStartTime(Date planStartTime) {
        this.planStartTime = planStartTime;
    }

    public Date getPlanEndTime() {
        return planEndTime;
    }

    public void setPlanEndTime(Date planEndTime) {
        this.planEndTime = planEndTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getIsDelayEnd() {
        return isDelayEnd;
    }

    public void setIsDelayEnd(Integer isDelayEnd) {
        this.isDelayEnd = isDelayEnd;
    }
}
