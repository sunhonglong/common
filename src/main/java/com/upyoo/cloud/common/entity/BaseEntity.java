package com.upyoo.cloud.common.entity;

import java.io.Serializable;
import java.util.UUID;

public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	String id;
    Long createdOn;
    Long updatedOn;
    Integer deleted = 0;

    public void generateId(){
    	this.id = UUID.randomUUID().toString();
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
    }

    public Long getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Long updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}
