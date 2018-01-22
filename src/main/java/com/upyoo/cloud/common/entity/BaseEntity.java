package com.upyoo.cloud.common.entity;

import java.io.Serializable;

public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private Long createTime;
	private Long updateTime;
	private Integer deleted;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public Long getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getDeleted() {
		return deleted;
	}
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

}
