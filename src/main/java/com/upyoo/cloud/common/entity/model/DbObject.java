package com.upyoo.cloud.common.entity.model;

import java.io.Serializable;

public class DbObject implements Serializable{
	private static final long serialVersionUID = 1L;
	 
    private String sysId;

    private String sysApplication;

    private String access;

    private Integer actionAccess;

    private Integer alterAccess;

    private Integer clientScriptsAccess;

    private Integer configurationAccess;

    private Integer createAccess;

    private Integer createAccessControls;

    private Integer deleteAccess;

    private String extensionModel;

    private Integer isExtendable;

    private String label;

    private Integer liveFeedEnabled;

    private String name;

    private String numberRef;

    private String providerClass;

    private Integer readAccess;

    private String superClass;

    private Integer updateAccess;

    private String userRole;

    private Integer wsAccess;

    private String sysClassName;

    private String sysCreatedBy;

    private Long sysCreatedOn;

    private Integer sysModCount;

    private String sysName;

    private String sysUpdatedBy;

    private Long sysUpdatedOn;

    private Integer sysDeleted;

    private Integer isCi;

    private Integer type;

    private String ownerSysDbObjectSystem;

    private Integer functionClass;
    
    private String owner;

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

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access == null ? null : access.trim();
    }

    public Integer getActionAccess() {
        return actionAccess;
    }

    public void setActionAccess(Integer actionAccess) {
        this.actionAccess = actionAccess;
    }

    public Integer getAlterAccess() {
        return alterAccess;
    }

    public void setAlterAccess(Integer alterAccess) {
        this.alterAccess = alterAccess;
    }

    public Integer getClientScriptsAccess() {
        return clientScriptsAccess;
    }

    public void setClientScriptsAccess(Integer clientScriptsAccess) {
        this.clientScriptsAccess = clientScriptsAccess;
    }

    public Integer getConfigurationAccess() {
        return configurationAccess;
    }

    public void setConfigurationAccess(Integer configurationAccess) {
        this.configurationAccess = configurationAccess;
    }

    public Integer getCreateAccess() {
        return createAccess;
    }

    public void setCreateAccess(Integer createAccess) {
        this.createAccess = createAccess;
    }

    public Integer getCreateAccessControls() {
        return createAccessControls;
    }

    public void setCreateAccessControls(Integer createAccessControls) {
        this.createAccessControls = createAccessControls;
    }

    public Integer getDeleteAccess() {
        return deleteAccess;
    }

    public void setDeleteAccess(Integer deleteAccess) {
        this.deleteAccess = deleteAccess;
    }

    public String getExtensionModel() {
        return extensionModel;
    }

    public void setExtensionModel(String extensionModel) {
        this.extensionModel = extensionModel == null ? null : extensionModel.trim();
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

    public Integer getLiveFeedEnabled() {
        return liveFeedEnabled;
    }

    public void setLiveFeedEnabled(Integer liveFeedEnabled) {
        this.liveFeedEnabled = liveFeedEnabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNumberRef() {
        return numberRef;
    }

    public void setNumberRef(String numberRef) {
        this.numberRef = numberRef == null ? null : numberRef.trim();
    }

    public String getProviderClass() {
        return providerClass;
    }

    public void setProviderClass(String providerClass) {
        this.providerClass = providerClass == null ? null : providerClass.trim();
    }

    public Integer getReadAccess() {
        return readAccess;
    }

    public void setReadAccess(Integer readAccess) {
        this.readAccess = readAccess;
    }

    public String getSuperClass() {
        return superClass;
    }

    public void setSuperClass(String superClass) {
        this.superClass = superClass == null ? null : superClass.trim();
    }

    public Integer getUpdateAccess() {
        return updateAccess;
    }

    public void setUpdateAccess(Integer updateAccess) {
        this.updateAccess = updateAccess;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole == null ? null : userRole.trim();
    }

    public Integer getWsAccess() {
        return wsAccess;
    }

    public void setWsAccess(Integer wsAccess) {
        this.wsAccess = wsAccess;
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

    public Integer getIsCi() {
        return isCi;
    }

    public void setIsCi(Integer isCi) {
        this.isCi = isCi;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOwnerSysDbObjectSystem() {
        return ownerSysDbObjectSystem;
    }

    public void setOwnerSysDbObjectSystem(String ownerSysDbObjectSystem) {
        this.ownerSysDbObjectSystem = ownerSysDbObjectSystem == null ? null : ownerSysDbObjectSystem.trim();
    }

    public Integer getFunctionClass() {
        return functionClass;
    }

    public void setFunctionClass(Integer functionClass) {
        this.functionClass = functionClass;
    }

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
    
    
}