package com.upyoo.cloud.common.entity.model;

import java.io.Serializable;

public class Dictionary implements Serializable {
	private static final long serialVersionUID = 1L;
	
    private String sysId;

    private String sysApplication;

    private Integer active;

    private Integer audit;

    private String choice;

    private String columnLabel;

    private String element;

    private String name;

    private String tableName;

    private String comments;

    private String internalType;

    private Integer maxLength;

    private Integer mandatory;

    private String reference;

    private String referenceKey;

    private String createRoles;

    private String defaultValue;

    private String deleteRoles;

    private Integer readOnly;

    private String readRoles;

    private String referenceQual;

    private String referenceQualCondition;

    private String sysClassName;

    private String sysCreatedBy;

    private Long sysCreatedOn;

    private Integer sysModCount;

    private String sysName;

    private String sysUpdatedBy;

    private Long sysUpdatedOn;

    private Integer sysDeleted;

    private String regex;

    private String multidata;

    private Integer viewType;

    private String owner;
    
    private Integer visible;

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId == null ? null : sysId.trim();
    }

    public String getSysApplication() {
        return sysApplication;
    }

    public void setSysApplication(String sysApplication) {
        this.sysApplication = sysApplication == null ? null : sysApplication.trim();
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getAudit() {
        return audit;
    }

    public void setAudit(Integer audit) {
        this.audit = audit;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice == null ? null : choice.trim();
    }

    public String getColumnLabel() {
        return columnLabel;
    }

    public void setColumnLabel(String columnLabel) {
        this.columnLabel = columnLabel == null ? null : columnLabel.trim();
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element == null ? null : element.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public String getInternalType() {
        return internalType;
    }

    public void setInternalType(String internalType) {
        this.internalType = internalType == null ? null : internalType.trim();
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public Integer getMandatory() {
        return mandatory;
    }

    public void setMandatory(Integer mandatory) {
        this.mandatory = mandatory;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference == null ? null : reference.trim();
    }

    public String getReferenceKey() {
        return referenceKey;
    }

    public void setReferenceKey(String referenceKey) {
        this.referenceKey = referenceKey == null ? null : referenceKey.trim();
    }

    public String getCreateRoles() {
        return createRoles;
    }

    public void setCreateRoles(String createRoles) {
        this.createRoles = createRoles == null ? null : createRoles.trim();
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue == null ? null : defaultValue.trim();
    }

    public String getDeleteRoles() {
        return deleteRoles;
    }

    public void setDeleteRoles(String deleteRoles) {
        this.deleteRoles = deleteRoles == null ? null : deleteRoles.trim();
    }

    public Integer getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Integer readOnly) {
        this.readOnly = readOnly;
    }

    public String getReadRoles() {
        return readRoles;
    }

    public void setReadRoles(String readRoles) {
        this.readRoles = readRoles == null ? null : readRoles.trim();
    }

    public String getReferenceQual() {
        return referenceQual;
    }

    public void setReferenceQual(String referenceQual) {
        this.referenceQual = referenceQual == null ? null : referenceQual.trim();
    }

    public String getReferenceQualCondition() {
        return referenceQualCondition;
    }

    public void setReferenceQualCondition(String referenceQualCondition) {
        this.referenceQualCondition = referenceQualCondition == null ? null : referenceQualCondition.trim();
    }

    public String getSysClassName() {
        return sysClassName;
    }

    public void setSysClassName(String sysClassName) {
        this.sysClassName = sysClassName == null ? null : sysClassName.trim();
    }

    public String getSysCreatedBy() {
        return sysCreatedBy;
    }

    public void setSysCreatedBy(String sysCreatedBy) {
        this.sysCreatedBy = sysCreatedBy == null ? null : sysCreatedBy.trim();
    }

    public Long getSysCreatedOn() {
        return sysCreatedOn;
    }

    public void setSysCreatedOn(Long sysCreatedOn) {
        this.sysCreatedOn = sysCreatedOn;
    }

    public Integer getSysModCount() {
        return sysModCount;
    }

    public void setSysModCount(Integer sysModCount) {
        this.sysModCount = sysModCount;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName == null ? null : sysName.trim();
    }

    public String getSysUpdatedBy() {
        return sysUpdatedBy;
    }

    public void setSysUpdatedBy(String sysUpdatedBy) {
        this.sysUpdatedBy = sysUpdatedBy == null ? null : sysUpdatedBy.trim();
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

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex == null ? null : regex.trim();
    }

    public String getMultidata() {
        return multidata;
    }

    public void setMultidata(String multidata) {
        this.multidata = multidata == null ? null : multidata.trim();
    }

    public Integer getViewType() {
        return viewType;
    }

    public void setViewType(Integer viewType) {
        this.viewType = viewType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

	public Integer getVisible() {
		return visible;
	}

	public void setVisible(Integer visible) {
		this.visible = visible;
	}
    
    
}