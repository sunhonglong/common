package com.upyoo.cloud.common.entity;

import java.io.Serializable;

public class CooperationApp extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String sysId;
	private String type;
	private String target;
	private String description;
	private String tag;
	private String sysCreatedOn;
	private String sysUpdatedOn;
	private String owner;
	private String bearychatChannel;
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

	public String getBearychatChannel() {
		return bearychatChannel;
	}

	public void setBearychatChannel(String bearychatChannel) {
		this.bearychatChannel = bearychatChannel;
	}

	public String getSysId() {
		return sysId;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getSysCreatedOn() {
		return sysCreatedOn;
	}

	public void setSysCreatedOn(String sysCreatedOn) {
		this.sysCreatedOn = sysCreatedOn;
	}

	public String getSysUpdatedOn() {
		return sysUpdatedOn;
	}

	public void setSysUpdatedOn(String sysUpdatedOn) {
		this.sysUpdatedOn = sysUpdatedOn;
	}
}
