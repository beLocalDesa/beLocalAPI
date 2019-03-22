package com.blackdevs.BeLocalAPI.model;

import com.blackdevs.BeLocalAPI.entity.Urlfriendly;

public class MUrlfriendly {
	
	public MUrlfriendly( ) {
		
	}
	
	public MUrlfriendly(Urlfriendly murlfriendly) {

		this.id = murlfriendly.getId();
		this.url = murlfriendly.getUrl();
		this.type = murlfriendly.getType();
	}	
	
	public MUrlfriendly(long _id, long _url, String _type) {
		this.id = _id;
		this.url = _url;
		this.type = _type;
	}
	
	private long id;
	private long url;
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
