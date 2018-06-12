package com.upyoo.cloud.common.entity.workflow;

import com.upyoo.cloud.common.entity.BaseEntity;

public class ElementUser extends BaseEntity{

	private static final long serialVersionUID = 1L;

	String element;
	String user;
	
	public String getElement() {
		return element;
	}
	public void setElement(String element) {
		this.element = element;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	
}
