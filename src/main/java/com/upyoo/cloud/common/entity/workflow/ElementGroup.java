package com.upyoo.cloud.common.entity.workflow;

import com.upyoo.cloud.common.entity.BaseEntity;

public class ElementGroup extends BaseEntity{

	private static final long serialVersionUID = 1L;

	String element;
	String group;
	
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getElement() {
		return element;
	}
	public void setElement(String element) {
		this.element = element;
	}
 
	
	
}
