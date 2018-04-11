package com.upyoo.cloud.common.entity.view;

import com.upyoo.cloud.common.entity.BaseEntity;
import com.upyoo.cloud.common.entity.model.Dictionary;

public class UiSectionElement extends BaseEntity {

    private String section;

    private String dictionaryElement;

    private Integer type;

    private Integer position;

    private Integer layout;

    private Integer mandatory;

    private Integer readOnly;

    private String defaultValue;

    Dictionary dbDictionary;

    private static final long serialVersionUID = 1L;

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getDictionaryElement() {
        return dictionaryElement;
    }

    public void setDictionaryElement(String dictionaryElement) {
        this.dictionaryElement = dictionaryElement;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
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
        this.defaultValue = defaultValue;
    }

    public Dictionary getDbDictionary() {
        return dbDictionary;
    }

    public void setDbDictionary(Dictionary dbDictionary) {
        this.dbDictionary = dbDictionary;
    }


}