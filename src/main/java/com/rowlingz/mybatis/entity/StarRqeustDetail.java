package com.rowlingz.mybatis.entity;

import lombok.Data;

@Data
public class StarRqeustDetail {
    private Long index;

    private Long cpId;

    private Long logTime;

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public Long getCpId() {
        return cpId;
    }

    public void setCpId(Long cpId) {
        this.cpId = cpId;
    }

    public Long getLogTime() {
        return logTime;
    }

    public void setLogTime(Long logTime) {
        this.logTime = logTime;
    }
}