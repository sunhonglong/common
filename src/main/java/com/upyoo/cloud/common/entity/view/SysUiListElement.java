package com.upyoo.cloud.common.entity.view;

import com.upyoo.cloud.common.entity.model.Dictionary;

public class SysUiListElement extends ViewBaseEntity {

    private String list;

    private String dictionary;

    private Integer position;

    Dictionary dbDictionary;

    private static final long serialVersionUID = 1L;

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public String getDictionary() {
        return dictionary;
    }

    public void setDictionary(String dictionary) {
        this.dictionary = dictionary;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Dictionary getDbDictionary() {
        return dbDictionary;
    }

    public void setDbDictionary(Dictionary dbDictionary) {
        this.dbDictionary = dbDictionary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sysId=").append(sysId);
        sb.append(", sysCreatedOn=").append(sysCreatedOn);
        sb.append(", sysUpdatedOn=").append(sysUpdatedOn);
        sb.append(", sysDeleted=").append(sysDeleted);
        sb.append(", list=").append(list);
        sb.append(", dictionary=").append(dictionary);
        sb.append(", position=").append(position);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}