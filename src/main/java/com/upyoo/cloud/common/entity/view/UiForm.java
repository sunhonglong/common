package com.upyoo.cloud.common.entity.view;

import com.upyoo.cloud.common.entity.BaseEntity;
import com.upyoo.cloud.common.entity.model.DbObject;

import java.util.List;

public class UiForm extends BaseEntity {

    private String owner;

    private String dbObjectName;

    private String name;

    private Integer isDefault;

    List<UiFormSection> sections;

    DbObject dbObject;

    private static final long serialVersionUID = 1L;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDbObjectName() {
        return dbObjectName;
    }

    public void setDbObjectName(String dbObjectName) {
        this.dbObjectName = dbObjectName;
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

    public List<UiFormSection> getSections() {
        return sections;
    }

    public void setSections(List<UiFormSection> sections) {
        this.sections = sections;
    }

    public DbObject getDbObject() {
        return dbObject;
    }

    public void setDbObject(DbObject dbObject) {
        this.dbObject = dbObject;
    }

}