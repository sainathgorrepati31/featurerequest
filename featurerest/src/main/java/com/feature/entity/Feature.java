package com.feature.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feature {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="FET_SEQ")
	private int id;
	
	private String title;
	
	private String description;
	
	private String client;
	
	private int clientPriority;
	
	private Date targetDate;
	
	private String productArea;

	public Feature() {
		
	}

	public Feature(int id, String title, String description, String client, int clientPriority, Date targetDate,
			String productArea) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.client = client;
		this.clientPriority = clientPriority;
		this.targetDate = targetDate;
		this.productArea = productArea;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public int getClientPriority() {
		return clientPriority;
	}

	public void setClientPriority(int clientPriority) {
		this.clientPriority = clientPriority;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public String getProductArea() {
		return productArea;
	}

	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}

	@Override
	public String toString() {
		return "Feature [id=" + id + ", title=" + title + ", description=" + description + ", client=" + client
				+ ", clientPriority=" + clientPriority + ", targetDate=" + targetDate + ", productArea=" + productArea
				+ "]";
	}

}
