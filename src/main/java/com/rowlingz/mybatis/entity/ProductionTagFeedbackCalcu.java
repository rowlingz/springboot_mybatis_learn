package com.rowlingz.mybatis.entity;

import java.util.Date;

public class ProductionTagFeedbackCalcu {
    private Long productionId;

    private String categoryPath;

    private Date inStockTime;

    private Integer status;

    private Byte isTbk;

    private Long tagId;

    private Integer feedbackCount;

    private Float feedbackSum;

    private Float feedbackAvg;

    public Long getProductionId() {
        return productionId;
    }

    public void setProductionId(Long productionId) {
        this.productionId = productionId;
    }

    public String getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath == null ? null : categoryPath.trim();
    }

    public Date getInStockTime() {
        return inStockTime;
    }

    public void setInStockTime(Date inStockTime) {
        this.inStockTime = inStockTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Byte getIsTbk() {
        return isTbk;
    }

    public void setIsTbk(Byte isTbk) {
        this.isTbk = isTbk;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Integer getFeedbackCount() {
        return feedbackCount;
    }

    public void setFeedbackCount(Integer feedbackCount) {
        this.feedbackCount = feedbackCount;
    }

    public Float getFeedbackSum() {
        return feedbackSum;
    }

    public void setFeedbackSum(Float feedbackSum) {
        this.feedbackSum = feedbackSum;
    }

    public Float getFeedbackAvg() {
        return feedbackAvg;
    }

    public void setFeedbackAvg(Float feedbackAvg) {
        this.feedbackAvg = feedbackAvg;
    }

    @Override
    public String toString() {
        return "ProductionTagFeedbackCalcu{" +
                "productionId=" + productionId +
                ", categoryPath='" + categoryPath + '\'' +
                ", inStockTime=" + inStockTime +
                ", status=" + status +
                ", isTbk=" + isTbk +
                ", tagId=" + tagId +
                ", feedbackCount=" + feedbackCount +
                ", feedbackSum=" + feedbackSum +
                ", feedbackAvg=" + feedbackAvg +
                '}';
    }
}