package com.upyoo.cloud.common.entity.view;

import com.upyoo.cloud.common.entity.model.Dictionary;

public class SysUiSectionElement extends ViewBaseEntity {

    private String section;

    private String dictionary;

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

    public String getDictionary() {
        return dictionary;
    }

    public void setDictionary(String dictionary) {
        this.dictionary = dictionary;
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
        sb.append(", section=").append(section);
        sb.append(", dictionary=").append(dictionary);
        sb.append(", type=").append(type);
        sb.append(", position=").append(position);
        sb.append(", layout=").append(layout);
        sb.append(", mandatory=").append(mandatory);
        sb.append(", readOnly=").append(readOnly);
        sb.append(", defaultValue=").append(defaultValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}