package com.blackdevs.BeLocalAPI.entity;

import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Table(name="bl_category")
@Entity
public class Category implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Category() { }
	public Category(long id, String name, long url) 
	{
		this.id=id;
		this.name=name;
		this.url=url;
	}
	
	@GeneratedValue
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="url")
	private long url;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getUrl() {
		return url;
	}
	public void setUrl(long url) {
		this.url = url;
	}

}

