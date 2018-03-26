package com.upyoo.cloud.common.entity.itsmview;

public class SysUiView {

    private String sysId;
    private String sysOwner;
    private long sysCreatedOn;
    private String sysCreatedBy;
    private long sysUpdatedOn;
    private String sysUpdatedBy;
    private int sysDeleted;
    private String viewName;
    private String viewTable;
    private String viewType;
    private String listSortElement;
    private int listSortType;
    private String formType;

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getSysOwner() {
        return sysOwner;
    }

    public void setSysOwner(String sysOwner) {
        this.sysOwner = sysOwner;
    }

    public long getSysCreatedOn() {
        return sysCreatedOn;
    }

    public void setSysCreatedOn(long sysCreatedOn) {
        this.sysCreatedOn = sysCreatedOn;
    }

    public String getSysCreatedBy() {
        return sysCreatedBy;
    }

    public void setSysCreatedBy(String sysCreatedBy) {
        this.sysCreatedBy = sysCreatedBy;
    }

    public long getSysUpdatedOn() {
        return sysUpdatedOn;
    }

    public void setSysUpdatedOn(long sysUpdatedOn) {
        this.sysUpdatedOn = sysUpdatedOn;
    }

    public String getSysUpdatedBy() {
        return sysUpdatedBy;
    }

    public void setSysUpdatedBy(String sysUpdatedBy) {
        this.sysUpdatedBy = sysUpdatedBy;
    }

    public int getSysDeleted() {
        return sysDeleted;
    }

    public void setSysDeleted(int sysDeleted) {
        this.sysDeleted = sysDeleted;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public String getViewTable() {
        return viewTable;
    }

    public void setViewTable(String viewTable) {
        this.viewTable = viewTable;
    }

    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    public String getListSortElement() {
        return listSortElement;
    }

    public void setListSortElement(String listSortElement) {
        this.listSortElement = listSortElement;
    }

    public int getListSortType() {
        return listSortType;
    }

    public void setListSortType(int listSortType) {
        this.listSortType = listSortType;
    }

    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    @Override
    public String toString() {
        return "SysUiView{" +
                "sysId='" + sysId + '\'' +
                ", sysOwner='" + sysOwner + '\'' +
                ", sysCreatedOn=" + sysCreatedOn +
                ", sysCreatedBy='" + sysCreatedBy + '\'' +
                ", sysUpdatedOn=" + sysUpdatedOn +
                ", sysUpdatedBy='" + sysUpdatedBy + '\'' +
                ", sysDeleted=" + sysDeleted +
                ", viewName='" + viewName + '\'' +
                ", viewTable='" + viewTable + '\'' +
                ", viewType='" + viewType + '\'' +
                ", listSortElement='" + listSortElement + '\'' +
                ", listSortType=" + listSortType +
                ", formType='" + formType + '\'' +
                '}';
    }
}
