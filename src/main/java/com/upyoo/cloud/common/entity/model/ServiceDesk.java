package com.upyoo.cloud.common.entity.model;

import java.util.ArrayList;
import java.util.List;

import com.upyoo.cloud.common.entity.BaseEntity;

public class ServiceDesk extends BaseEntity {

	private static final long serialVersionUID = 1L;
	private String name;
	private String owner;
	private String color;
	private List<ServiceItem> serviceItems = new ArrayList<>();

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public List<ServiceItem> getServiceItems() {
		return serviceItems;
	}
	public void setServiceItems(List<ServiceItem> serviceItems) {
		this.serviceItems = serviceItems;
	}

}
