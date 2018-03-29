package com.upyoo.cloud.common.entity.itsmview;

import java.io.Serializable;

public class SysUiListElement implements Serializable {
    private String sysId;

    private String sysOwner;

    private Long sysCreatedOn;

    private String sysCreatedBy;

    private Long sysUpdatedOn;

    private String sysUpdatedBy;

    private Integer sysDeleted;

    private String list;

    private String dictionary;

    private Integer position;

    private static final long serialVersionUID = 1L;

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId == null ? null : sysId.trim();
    }

    public String getSysOwner() {
        return sysOwner;
    }

    public void setSysOwner(String sysOwner) {
        this.sysOwner = sysOwner == null ? null : sysOwner.trim();
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
        this.sysCreatedBy = sysCreatedBy == null ? null : sysCreatedBy.trim();
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
        this.sysUpdatedBy = sysUpdatedBy == null ? null : sysUpdatedBy.trim();
    }

    public Integer getSysDeleted() {
        return sysDeleted;
    }

    public void setSysDeleted(Integer sysDeleted) {
        this.sysDeleted = sysDeleted;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list == null ? null : list.trim();
    }

    public String getDictionary() {
        return dictionary;
    }

    public void setDictionary(String dictionary) {
        this.dictionary = dictionary == null ? null : dictionary.trim();
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sysId=").append(sysId);
        sb.append(", sysOwner=").append(sysOwner);
        sb.append(", sysCreatedOn=").append(sysCreatedOn);
        sb.append(", sysCreatedBy=").append(sysCreatedBy);
        sb.append(", sysUpdatedOn=").append(sysUpdatedOn);
        sb.append(", sysUpdatedBy=").append(sysUpdatedBy);
        sb.append(", sysDeleted=").append(sysDeleted);
        sb.append(", list=").append(list);
        sb.append(", dictionary=").append(dictionary);
        sb.append(", position=").append(position);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}