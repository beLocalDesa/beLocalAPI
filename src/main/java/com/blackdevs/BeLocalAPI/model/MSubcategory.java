package com.blackdevs.BeLocalAPI.model;

import com.blackdevs.BeLocalAPI.entity.Subcategory;

public class MSubcategory {
	
	public MSubcategory() {

	}
	
	public MSubcategory(Subcategory subcategory) {
		this.id = subcategory.getId();
		this.category = subcategory.getCategory();
		this.name = subcategory.getName();
		this.url = subcategory.getUrl();
	}
	
	public MSubcategory(long _id, long _category, String _name, long _url) {
		this.id = _id;
		this.category = _category;
		this.name = _name;
		this.url = _url;
	}
	
	private long id;
	private long category;
	private String name;
	private long url;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCategory() {
		return category;
	}

	public void setCategory(long category) {
		this.category = category;
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
