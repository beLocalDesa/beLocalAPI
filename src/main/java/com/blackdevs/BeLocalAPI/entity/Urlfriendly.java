package com.blackdevs.BeLocalAPI.entity;

import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Table(name="bl_urlfriendly")
@Entity
public class Urlfriendly implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Urlfriendly() {

	}
	
	public Urlfriendly(long _id, long _url, String _type) {
		this.id = _id;
		this.url = _url;
		this.type = _type;
	}

	@GeneratedValue
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="url")
	private long url;
	
	@Column(name="type")
	private String type;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUrl() {
		return url;
	}

	public void setUrl(long url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
		
}
