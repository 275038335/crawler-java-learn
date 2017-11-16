package com.chinaredstar.jc.crawler.biz.result.constraction;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: fangjian<jian.fang@chinaredstar.com>
 * @date: Create in 10:13 2017/9/26
 * @modified by:
 */
public class ConstructionDetailResult {


    private String constructionCode;

    private String projectCode;
    private String projectName;
    private String projectAddress;

    private Integer constructionSum;

    private Integer endNum;

    private Date startTime;

    private Date endTime;

    private Integer duration;

    private List<ConstructionItemListResult> itemList;

    public String getConstructionCode() {
        return constructionCode;
    }

    public void setConstructionCode(String constructionCode) {
        this.constructionCode = constructionCode;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public Integer getConstructionSum() {
        return constructionSum;
    }

    public void setConstructionSum(Integer constructionSum) {
        this.constructionSum = constructionSum;
    }

    public Integer getEndNum() {
        return endNum;
    }

    public void setEndNum(Integer endNum) {
        this.endNum = endNum;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public List<ConstructionItemListResult> getItemList() {
        return itemList;
    }

    public void setItemList(List<ConstructionItemListResult> itemList) {
        this.itemList = itemList;
    }
}
