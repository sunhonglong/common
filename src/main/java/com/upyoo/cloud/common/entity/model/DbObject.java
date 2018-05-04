package com.upyoo.cloud.common.entity.model;

import java.io.Serializable;

public class DbObject implements Serializable{
	private static final long serialVersionUID = 1L;
	 
    private String sysId;

    private String sysApplication;

    private Integer isExtendable;

    private String label;

    private String name;

    private String superClass;

    private String sysClassName;

    private String sysCreatedBy;

    private Long sysCreatedOn;

    private String sysUpdatedBy;

    private Long sysUpdatedOn;

    private Integer sysDeleted;

    private Integer type;

    private String owner;
    
    private Integer sysModCount;

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


    public Integer getIsExtendable() {
        return isExtendable;
    }

    public void setIsExtendable(Integer isExtendable) {
        this.isExtendable = isExtendable;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }


    public String getSuperClass() {
        return superClass;
    }

    public void setSuperClass(String superClass) {
        this.superClass = superClass == null ? null : superClass.trim();
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


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }



	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Integer getSysModCount() {
		return sysModCount;
	}

	public void setSysModCount(Integer sysModCount) {
		this.sysModCount = sysModCount;
	}
    
	
    
}