package com.upyoo.cloud.common.entity.view;

import java.util.List;

import com.upyoo.cloud.common.entity.BaseEntity;

public class UiFormSection extends BaseEntity {

    private String form;

    private String name;

    private Integer position;

    List<UiSectionElement> elements;

    private static final long serialVersionUID = 1L;

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public List<UiSectionElement> getElements() {
        return elements;
    }

    public void setElements(List<UiSectionElement> elements) {
        this.elements = elements;
    }

}