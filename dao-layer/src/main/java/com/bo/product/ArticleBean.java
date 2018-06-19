package com.bo.product;

import java.util.Date;

public class ArticleBean {

	private long id;
	private String label;
	private String description;
	private Date creationDate;
	
	public ArticleBean(long id, String label, String description, Date creationDate) {
		super();
		this.id = id;
		this.label = label;
		this.description = description;
		this.creationDate = creationDate;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
}
