package com.upyoo.cloud.common.entity.model;


import com.upyoo.cloud.common.entity.BaseEntity;

public class ServiceItem extends BaseEntity{

	private static final long serialVersionUID = 1L;
	private String name;
	private String owner;
	private String serviceDesk;
	private String dbObjectName;
	private String dbObject;
	
	public String getDbObjectName() {
		return dbObjectName;
	}
	public void setDbObjectName(String dbObjectName) {
		this.dbObjectName = dbObjectName;
	}

	public String getDbObject() {
		return dbObject;
	}
	public void setDbObject(String dbObject) {
		this.dbObject = dbObject;
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
	public String getServiceDesk() {
		return serviceDesk;
	}
	public void setServiceDesk(String serviceDesk) {
		this.serviceDesk = serviceDesk;
	}

}
