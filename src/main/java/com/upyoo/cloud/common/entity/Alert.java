package com.upyoo.cloud.common.entity;

import java.io.Serializable;

public class Alert implements Serializable {
	private static final long serialVersionUID = 1L;
	protected Integer id;
	private Integer alarmId;
	private Long creationTime;
    private Long modifiedTime;
    private Integer version;
	private String alarmType;
	private String alarmName;
	private String entityName;
	private String hostIp;
	private String status;
	private Long autoResolve;
	private Integer parentAlarmId;
	private String host;
	private String service;
	private String tag;
	private String metric;
	private Integer activeCount;
	private String activeAlarm;
	private Integer alarmVersion;
	private String owner;
	private String assignments;
	private String users;
	private String alarmContent;
	private Integer priority;
	protected Long ackTime;
	protected String ackUser;
	private Long closeTime;
	private String closeUser;
	private String closeComments;
	private String entityId;
	private Integer alertDefId;
	private String policyId;
	private String source;
	private String user;
	private String app;
	private String eventId;
	private String sourceUrl;
	private Integer ext;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAlarmId() {
		return alarmId;
	}

	public void setAlarmId(Integer alarmId) {
		this.alarmId = alarmId;
	}

	public Long getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Long creationTime) {
		this.creationTime = creationTime;
	}

	public Long getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Long modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getAlarmType() {
		return alarmType;
	}

	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
	}

	public String getAlarmName() {
		return alarmName;
	}

	public void setAlarmName(String alarmName) {
		this.alarmName = alarmName;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getHostIp() {
		return hostIp;
	}

	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getAutoResolve() {
		return autoResolve;
	}

	public void setAutoResolve(Long autoResolve) {
		this.autoResolve = autoResolve;
	}

	public Integer getParentAlarmId() {
		return parentAlarmId;
	}

	public void setParentAlarmId(Integer parentAlarmId) {
		this.parentAlarmId = parentAlarmId;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getMetric() {
		return metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
	}

	public Integer getActiveCount() {
		return activeCount;
	}

	public void setActiveCount(Integer activeCount) {
		this.activeCount = activeCount;
	}

	public String getActiveAlarm() {
		return activeAlarm;
	}

	public void setActiveAlarm(String activeAlarm) {
		this.activeAlarm = activeAlarm;
	}

	public Integer getAlarmVersion() {
		return alarmVersion;
	}

	public void setAlarmVersion(Integer alarmVersion) {
		this.alarmVersion = alarmVersion;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAssignments() {
		return assignments;
	}

	public void setAssignments(String assignments) {
		this.assignments = assignments;
	}

	public String getUsers() {
		return users;
	}

	public void setUsers(String users) {
		this.users = users;
	}

	public String getAlarmContent() {
		return alarmContent;
	}

	public void setAlarmContent(String alarmContent) {
		this.alarmContent = alarmContent;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Long getAckTime() {
		return ackTime;
	}

	public void setAckTime(Long ackTime) {
		this.ackTime = ackTime;
	}

	public String getAckUser() {
		return ackUser;
	}

	public void setAckUser(String ackUser) {
		this.ackUser = ackUser;
	}

	public Long getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(Long closeTime) {
		this.closeTime = closeTime;
	}

	public String getCloseUser() {
		return closeUser;
	}

	public void setCloseUser(String closeUser) {
		this.closeUser = closeUser;
	}

	public String getCloseComments() {
		return closeComments;
	}

	public void setCloseComments(String closeComments) {
		this.closeComments = closeComments;
	}

	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public Integer getAlertDefId() {
		return alertDefId;
	}

	public void setAlertDefId(Integer alertDefId) {
		this.alertDefId = alertDefId;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public Integer getExt() {
		return ext;
	}

	public void setExt(Integer ext) {
		this.ext = ext;
	}
}
