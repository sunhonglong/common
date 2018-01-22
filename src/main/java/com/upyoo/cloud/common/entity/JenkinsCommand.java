package com.upyoo.cloud.common.entity;

import java.io.Serializable;

public class JenkinsCommand extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	private String cooperationApp;
	private String cmd ;
	private String owner;
	private String jenkinsJobName;
	private String jenkinsApiType;
	private String jenkinsParameter;
	
	public String getCooperationApp() {
		return cooperationApp;
	}
	public void setCooperationApp(String cooperationApp) {
		this.cooperationApp = cooperationApp;
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
