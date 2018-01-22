package com.upyoo.cloud.common.entity;

import java.io.Serializable;

public class CooperationApp extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String type;
	private String target;
	private String description;
	private String owner;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
