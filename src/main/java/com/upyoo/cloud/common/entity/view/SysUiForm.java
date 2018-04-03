package com.upyoo.cloud.common.entity.view;

import com.upyoo.cloud.common.entity.model.DbObject;

import java.util.List;

public class SysUiForm extends ViewBaseEntity {

    private String sysOwner;

    private String object;

    private String name;

    private Integer isDefault;

    List<SysUiFormSection> sections;

    DbObject dbObject;

    private static final long serialVersionUID = 1L;

    public String getSysOwner() {
        return sysOwner;
    }

    public void setSysOwner(String sysOwner) {
        this.sysOwner = sysOwner;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public List<SysUiFormSection> getSections() {
        return sections;
    }

    public void setSections(List<SysUiFormSection> sections) {
        this.sections = sections;
    }

    public DbObject getDbObject() {
        return dbObject;
    }

    public void setDbObject(DbObject dbObject) {
        this.dbObject = dbObject;
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
        sb.append(", object=").append(object);
        sb.append(", name=").append(name);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}