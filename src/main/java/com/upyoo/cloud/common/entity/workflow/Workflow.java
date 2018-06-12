package com.upyoo.cloud.common.entity.workflow;

import java.util.List;

import com.upyoo.cloud.common.entity.BaseEntity;

public class Workflow extends BaseEntity{
	
	private static final long serialVersionUID = 1L;
	
	String db_object_name;
	String name;
	String owner;
	
	List<Element> elements;
	List<Transition> transitions;
	
	public List<Element> getElements() {
		return elements;
	}
	public void setElements(List<Element> elements) {
		this.elements = elements;
	}
	public List<Transition> getTransitions() {
		return transitions;
	}
	public void setTransitions(List<Transition> transitions) {
		this.transitions = transitions;
	}
	public String getDb_object_name() {
		return db_object_name;
	}
	public void setDb_object_name(String db_object_name) {
		this.db_object_name = db_object_name;
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
	
}
