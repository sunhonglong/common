package com.upyoo.cloud.common.entity.view;

import com.upyoo.cloud.common.entity.BaseEntity;
import com.upyoo.cloud.common.entity.model.Dictionary;

public class UiListElement extends BaseEntity {

    private String list;

    private String dictionaryElement;

    private Integer position;

    Dictionary dbDictionary;

    private static final long serialVersionUID = 1L;

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public String getDictionaryElement() {
        return dictionaryElement;
    }

    public void setDictionaryElement(String dictionaryElement) {
        this.dictionaryElement = dictionaryElement;
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

}