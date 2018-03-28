package com.upyoo.cloud.common.entity.itsmview;

import java.io.Serializable;

public class SysUiSectionElement implements Serializable {
    private String sysId;

    private String sysOwner;

    private Long sysCreatedOn;

    private String sysCreatedBy;

    private Long sysUpdatedOn;

    private String sysUpdatedBy;

    private Integer sysDeleted;

    private String section;

    private String dictionary;

    private Integer type;

    private Integer sort;

    private Integer layout;

    private Integer mandatory;

    private Integer readOnly;

    private String defaultValue;

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

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section == null ? null : section.trim();
    }

    public String getDictionary() {
        return dictionary;
    }

    public void setDictionary(String dictionary) {
        this.dictionary = dictionary == null ? null : dictionary.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getLayout() {
        return layout;
    }

    public void setLayout(Integer layout) {
        this.layout = layout;
    }

    public Integer getMandatory() {
        return mandatory;
    }

    public void setMandatory(Integer mandatory) {
        this.mandatory = mandatory;
    }

    public Integer getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Integer readOnly) {
        this.readOnly = readOnly;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue == null ? null : defaultValue.trim();
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
        sb.append(", section=").append(section);
        sb.append(", dictionary=").append(dictionary);
        sb.append(", type=").append(type);
        sb.append(", sort=").append(sort);
        sb.append(", layout=").append(layout);
        sb.append(", mandatory=").append(mandatory);
        sb.append(", readOnly=").append(readOnly);
        sb.append(", defaultValue=").append(defaultValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}