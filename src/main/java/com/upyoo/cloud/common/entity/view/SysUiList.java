package com.upyoo.cloud.common.entity.view;

import com.upyoo.cloud.common.entity.model.Dictionary;

import java.util.List;

public class SysUiList extends ViewBaseEntity {

    private String sysOwner;

    private String object;

    private String dictionary;

    private Integer sortType;

    Dictionary dbDictionary;

    List<SysUiListElement> elements;

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

    public String getDictionary() {
        return dictionary;
    }

    public void setDictionary(String dictionary) {
        this.dictionary = dictionary;
    }

    public Integer getSortType() {
        return sortType;
    }

    public void setSortType(Integer sortType) {
        this.sortType = sortType;
    }

    public Dictionary getDbDictionary() {
        return dbDictionary;
    }

    public void setDbDictionary(Dictionary dbDictionary) {
        this.dbDictionary = dbDictionary;
    }

    public List<SysUiListElement> getElements() {
        return elements;
    }

    public void setElements(List<SysUiListElement> elements) {
        this.elements = elements;
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
        sb.append(", dictionary=").append(dictionary);
        sb.append(", sortType=").append(sortType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}