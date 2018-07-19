package com.upyoo.cloud.common.entity.situation;

import java.io.Serializable;

public class SituationPolicy implements Serializable{
	
	private static final long serialVersionUID = 1L;
	//ID
	private String id;
	//NAME
	private String name;
	//SITUATION_DESCRIPTION
	private String situationDescription;
	//TRIGGER_FILTER
	private String triggerFilter;
	//ALARM_THRESHOLD
	private Integer alarmThreshold;
	//COOK_FOR
	private Long cookFor;
	//CONTENT_CLUSTER
	private Integer contentCluster;//CONTENT_CLUSTER;
	//CONTENT_CLUSTER_SIMILARITY
	private Float contentClusterSimilarity;
	//HOST_CLUSTER
	private Integer hostCluster;
	//HOST_CLUSTER_SIMILARITY
	private Float hostClusterSimilarity;
	//SERVICE_CLUSTER
	private Integer serviceCluster;
	//SERVICE_CLUSTER_SIMILARITY
	private Float serviceClusterSimilarity;
	//OWNER
	private String owner;
	//CREATE_TIME
	private Long createTime;
	//UPDATE_TIME
	private Long updateTime;
	//DELETED
	private Integer deleted;
	
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSituationDescription() {
		return situationDescription;
	}
	public void setSituationDescription(String situationDescription) {
		this.situationDescription = situationDescription;
	}
	public String getTriggerFilter() {
		return triggerFilter;
	}
	public void setTriggerFilter(String triggerFilter) {
		this.triggerFilter = triggerFilter;
	}
	public Integer getAlarmThreshold() {
		return alarmThreshold;
	}
	public void setAlarmThreshold(Integer alarmThreshold) {
		this.alarmThreshold = alarmThreshold;
	}
	public Long getCookFor() {
		return cookFor;
	}
	public void setCookFor(Long cookFor) {
		this.cookFor = cookFor;
	}
	public Integer getContentCluster() {
		return contentCluster;
	}
	public void setContentCluster(Integer contentCluster) {
		this.contentCluster = contentCluster;
	}
	public Float getContentClusterSimilarity() {
		return contentClusterSimilarity;
	}
	public void setContentClusterSimilarity(Float contentClusterSimilarity) {
		this.contentClusterSimilarity = contentClusterSimilarity;
	}
	public Integer getHostCluster() {
		return hostCluster;
	}
	public void setHostCluster(Integer hostCluster) {
		this.hostCluster = hostCluster;
	}
	public Float getHostClusterSimilarity() {
		return hostClusterSimilarity;
	}
	public void setHostClusterSimilarity(Float hostClusterSimilarity) {
		this.hostClusterSimilarity = hostClusterSimilarity;
	}
	public Integer getServiceCluster() {
		return serviceCluster;
	}
	public void setServiceCluster(Integer serviceCluster) {
		this.serviceCluster = serviceCluster;
	}
	public Float getServiceClusterSimilarity() {
		return serviceClusterSimilarity;
	}
	public void setServiceClusterSimilarity(Float serviceClusterSimilarity) {
		this.serviceClusterSimilarity = serviceClusterSimilarity;
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
