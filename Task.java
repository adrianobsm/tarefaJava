package com.taskmanager.servlets;

import java.io.Serializable;
import java.util.UUID;
public class Task  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String title;
	private String descrition;
	private Boolean priority;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescrition() {
		return descrition;
	}
	
	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	
	public Boolean getPriority() {
		return priority;
	}
	
	public void setPriority(Boolean priority) {
		this.priority = priority;
	}
	
	public Task() {
		super ();
		this .id = UUID. randomUUID ().toString();
		this .priority =  false ;
	}
}