package com.upyoo.cloud.common.entity;

import java.io.Serializable;

public class AutoAppCmd implements Serializable{

	private static final long serialVersionUID = 1L;

	private String id ;
	private String autoapp;
	private String cmd ;
	private String owner;
	private Long createTime;
	private Long updateTime;
	private Integer deleted;
	private String jenkinsJobName;
	private String jenkinsApiType;
	private String jenkinsParameter;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAutoapp() {
		return autoapp;
	}
	public void setAutoapp(String autoapp) {
		this.autoapp = autoapp;
	}
	public String getCmd() {
		return cmd;
	}
	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public Long getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getDeleted() {
		return deleted;
	}
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	public String getJenkinsJobName() {
		return jenkinsJobName;
	}
	public void setJenkinsJobName(String jenkinsJobName) {
		this.jenkinsJobName = jenkinsJobName;
	}
	public String getJenkinsApiType() {
		return jenkinsApiType;
	}
	public void setJenkinsApiType(String jenkinsApiType) {
		this.jenkinsApiType = jenkinsApiType;
	}
	public String getJenkinsParameter() {
		return jenkinsParameter;
	}
	public void setJenkinsParameter(String jenkinsParameter) {
		this.jenkinsParameter = jenkinsParameter;
	}
	
	
	
}
