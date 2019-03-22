package com.blackdevs.BeLocalAPI.model;

import com.blackdevs.BeLocalAPI.entity.City;

public class MCity {
	
	public MCity() { 
		
	}
	
	public MCity(City city) {
		this.id = city.getId();
		this.name = city.getName();
		this.url = city.getUrl();
	}
	
	public MCity(long _id, String _name, long _url) {
		this.id = _id;
		this.name = _name;
		this.url = _url;
	}
	private long id;
	private String name;
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
