package com.upyoo.cloud.common.entity;

import java.io.Serializable;

public class CooperationApp extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sysId;
    private String type;
    private String sysType;
    private String target;
    private String description;
    private String tag;
    private Long sysCreatedOn;
    private Long sysUpdatedOn;
    private Integer sysDeleted;
    private String owner;
    private String jenkinsUsername;
    private String jenkinsPassword;
    private String jenkinsUrl;
    private String bearychatChannel;
    private Integer bearychatActive;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBearychatChannel() {
        return bearychatChannel;
    }

    public void setBearychatChannel(String bearychatChannel) {
        this.bearychatChannel = bearychatChannel;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getSysType() {
        return sysType;
    }

    public void setSysType(String sysType) {
        this.sysType = sysType;
    }

    public Integer getBearychatActive() {
        return bearychatActive;
    }

    public void setBearychatActive(Integer bearychatActive) {
        this.bearychatActive = bearychatActive;
    }

    public String getJenkinsUsername() {
        return jenkinsUsername;
    }

    public void setJenkinsUsername(String jenkinsUsername) {
        this.jenkinsUsername = jenkinsUsername;
    }

    public String getJenkinsPassword() {
        return jenkinsPassword;
    }

    public void setJenkinsPassword(String jenkinsPassword) {
        this.jenkinsPassword = jenkinsPassword;
    }

    public String getJenkinsUrl() {
        return jenkinsUrl;
    }

    public void setJenkinsUrl(String jenkinsUrl) {
        this.jenkinsUrl = jenkinsUrl;
    }

    public Long getSysCreatedOn() {
        return sysCreatedOn;
    }

    public void setSysCreatedOn(Long sysCreatedOn) {
        this.sysCreatedOn = sysCreatedOn;
    }

    public Long getSysUpdatedOn() {
        return sysUpdatedOn;
    }

    public void setSysUpdatedOn(Long sysUpdatedOn) {
        this.sysUpdatedOn = sysUpdatedOn;
    }

    public Integer getSysDeleted() {
        return sysDeleted;
    }

    public void setSysDeleted(Integer sysDeleted) {
        this.sysDeleted = sysDeleted;
    }

    @Override
    public String toString() {
        return "CooperationApp{" +
                "sysId='" + sysId + '\'' +
                ", type='" + type + '\'' +
                ", sysType='" + sysType + '\'' +
                ", target='" + target + '\'' +
                ", description='" + description + '\'' +
                ", tag='" + tag + '\'' +
                ", sysCreatedOn=" + sysCreatedOn +
                ", sysUpdatedOn=" + sysUpdatedOn +
                ", sysDeleted=" + sysDeleted +
                ", owner='" + owner + '\'' +
                ", jenkinsUsername='" + jenkinsUsername + '\'' +
                ", jenkinsPassword='" + jenkinsPassword + '\'' +
                ", jenkinsUrl='" + jenkinsUrl + '\'' +
                ", bearychatChannel='" + bearychatChannel + '\'' +
                ", bearychatActive=" + bearychatActive +
                '}';
    }
}
