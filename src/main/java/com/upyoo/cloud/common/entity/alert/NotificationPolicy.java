package com.upyoo.cloud.common.entity.alert;

import com.upyoo.cloud.common.entity.BaseEntity;

public class NotificationPolicy extends BaseEntity{
	
	private static final long serialVersionUID = 1L;

	String notifyType;
	String policyType;
	String username;
	String target;
	String status;
	public String getNotifyType() {
		return notifyType;
	}
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
