package com.upyoo.cloud.common.entity.view;

import com.upyoo.cloud.common.entity.BaseEntity;
import com.upyoo.cloud.common.entity.model.DbObject;

import java.util.List;

public class UiList extends BaseEntity {

    private String owner;

    private String dbObjectName;

    private String dictionaryElement; //排序字段

    private Integer sortType;

    DbObject dbObject;

    List<UiListElement> elements;

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

    public String getDictionaryElement() {
        return dictionaryElement;
    }

    public void setDictionaryElement(String dictionaryElement) {
        this.dictionaryElement = dictionaryElement;
    }

    public Integer getSortType() {
        return sortType;
    }

    public void setSortType(Integer sortType) {
        this.sortType = sortType;
    }

    public List<UiListElement> getElements() {
        return elements;
    }

    public void setElements(List<UiListElement> elements) {
        this.elements = elements;
    }

    public DbObject getDbObject() {
        return dbObject;
    }

    public void setDbObject(DbObject dbObject) {
        this.dbObject = dbObject;
    }
}