package com.blackdevs.BeLocalAPI.model;

import com.blackdevs.BeLocalAPI.entity.District;

public class MDistrict {
	
	public MDistrict() {
	}
	
	public MDistrict(District district) {
		this.id = district.getId();
		this.name = district.getName();
		this.url = district.getUrl();
	}
	
	public MDistrict(long _id, String _name, long _url) {
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
