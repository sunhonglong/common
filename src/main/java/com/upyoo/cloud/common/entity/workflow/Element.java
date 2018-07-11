package com.upyoo.cloud.common.entity.workflow;

import com.upyoo.cloud.common.entity.BaseEntity;

public class Element extends BaseEntity{

	
	private static final long serialVersionUID = 1L;

	String name;
	String positionLeft;
	String positionTop;
	String workflow;
	String elementType;
	String elementId;
	String assignee;
	String assignee_group;
	String owner;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPositionLeft() {
		return positionLeft;
	}
	public void setPositionLeft(String positionLeft) {
		this.positionLeft = positionLeft;
	}
	public String getPositionTop() {
		return positionTop;
	}
	public void setPositionTop(String positionTop) {
		this.positionTop = positionTop;
	}
	public String getWorkflow() {
		return workflow;
	}
	public void setWorkflow(String workflow) {
		this.workflow = workflow;
	}
	public String getElementType() {
		return elementType;
	}
	public void setElementType(String elementType) {
		this.elementType = elementType;
	}
	public String getElementId() {
		return elementId;
	}
	public void setElementId(String elementId) {
		this.elementId = elementId;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public String getAssignee_group() {
		return assignee_group;
	}
	public void setAssignee_group(String assignee_group) {
		this.assignee_group = assignee_group;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
