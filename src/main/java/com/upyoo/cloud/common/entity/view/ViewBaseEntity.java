package com.upyoo.cloud.common.entity.view;

import java.io.Serializable;

public class ViewBaseEntity implements Serializable {
    String sysId;
    Long sysCreatedOn;
    String sysCreatedBy;
    Long sysUpdatedOn;
    String sysUpdatedBy;
    Integer sysDeleted;

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public Long getSysCreatedOn() {
        return sysCreatedOn;
    }

    public void setSysCreatedOn(Long sysCreatedOn) {
        this.sysCreatedOn = sysCreatedOn;
    }

    public String getSysCreatedBy() {
        return sysCreatedBy;
    }

    public void setSysCreatedBy(String sysCreatedBy) {
        this.sysCreatedBy = sysCreatedBy;
    }

    public Long getSysUpdatedOn() {
        return sysUpdatedOn;
    }

    public void setSysUpdatedOn(Long sysUpdatedOn) {
        this.sysUpdatedOn = sysUpdatedOn;
    }

    public String getSysUpdatedBy() {
        return sysUpdatedBy;
    }

    public void setSysUpdatedBy(String sysUpdatedBy) {
        this.sysUpdatedBy = sysUpdatedBy;
    }

    public Integer getSysDeleted() {
        return sysDeleted;
    }

    public void setSysDeleted(Integer sysDeleted) {
        this.sysDeleted = sysDeleted;
    }
}
