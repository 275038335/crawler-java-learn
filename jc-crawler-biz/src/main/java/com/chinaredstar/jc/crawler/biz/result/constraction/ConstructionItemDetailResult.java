package com.chinaredstar.jc.crawler.biz.result.constraction;

import com.chinaredstar.jc.crawler.common.util.BizUtils;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: fangjian<jian.fang@chinaredstar.com>
 * @date: Create in 10:13 2017/9/26
 * @modified by:
 */
public class ConstructionItemDetailResult {

    private Integer id;

    private String content;

    private Date planStartTime;

    private Date planEndTime;

    private Date realStartTime;

    private Date realEndTime;

    private Integer state;

    private Integer isDelayStart;

    private Integer isDelayEnd;

    private String startInfo;

    private String endInfo;

    private List<String> startPicList;

    private List<String> endPicList;

    private Integer planDuration;//计划工期
    private Integer realDuration;//实际工期

    public Integer getPlanDuration() {
        if (null != planStartTime && null != planEndTime) {
            return BizUtils.differentDays(planStartTime, planEndTime) + 1;
        }
        return null;
    }

    public Integer getRealDuration() {
        if (null != realStartTime && null != realEndTime) {
            return BizUtils.differentDays(realStartTime, realEndTime) + 1;
        }
        return null;
    }


    public List<String> getStartPicList() {
        return startPicList;
    }

    public void setStartPicList(List<String> startPicList) {
        this.startPicList = startPicList;
    }

    public List<String> getEndPicList() {
        return endPicList;
    }

    public void setEndPicList(List<String> endPicList) {
        this.endPicList = endPicList;
    }

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

    public Date getRealStartTime() {
        return realStartTime;
    }

    public void setRealStartTime(Date realStartTime) {
        this.realStartTime = realStartTime;
    }

    public Date getRealEndTime() {
        return realEndTime;
    }

    public void setRealEndTime(Date realEndTime) {
        this.realEndTime = realEndTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getIsDelayStart() {
        return isDelayStart;
    }

    public void setIsDelayStart(Integer isDelayStart) {
        this.isDelayStart = isDelayStart;
    }

    public Integer getIsDelayEnd() {
        return isDelayEnd;
    }

    public void setIsDelayEnd(Integer isDelayEnd) {
        this.isDelayEnd = isDelayEnd;
    }

    public String getStartInfo() {
        return startInfo;
    }

    public void setStartInfo(String startInfo) {
        this.startInfo = startInfo;
    }

    public String getEndInfo() {
        return endInfo;
    }

    public void setEndInfo(String endInfo) {
        this.endInfo = endInfo;
    }
}
