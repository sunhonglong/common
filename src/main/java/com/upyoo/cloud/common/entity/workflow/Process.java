package com.upyoo.cloud.common.entity.workflow;

import com.upyoo.cloud.common.entity.BaseEntity;

public class Process extends BaseEntity {

	private static final long serialVersionUID = 1L;

	String workflow;
	String task;
	String obObjectName;
	String status;
	String owner;
	public String getWorkflow() {
		return workflow;
	}
	public void setWorkflow(String workflow) {
		this.workflow = workflow;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getObObjectName() {
		return obObjectName;
	}
	public void setObObjectName(String obObjectName) {
		this.obObjectName = obObjectName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
