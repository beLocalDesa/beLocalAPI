package com.blackdevs.BeLocalAPI.model;

import com.blackdevs.BeLocalAPI.entity.Store;

public class MStore {
	
	public MStore() {
		
	}
	
	public MStore(Store store) {
		this.id = store.getId();
		this.name = store.getName();
		this.phone = store.getPhone();
		this.email = store.getEmail();
		this.postal_address = store.getPostal_address();
		this.postal_code = store.getPostal_code();
		this.url = store.getUrl();
		this.district = store.getDistrict();
		this.category = store.getCategory();
	}
	
	public MStore(long _id, String _name, long _phone, String _email, String _postal_address, long _postal_code,
			long _url, long _district, long _category) {
	
		this.id = _id;
		this.name = _name;
		this.phone = _phone;
		this.email = _email;
		this.postal_address = _postal_address;
		this.postal_code = _postal_code;
		this.url = _url;
		this.district = _district;
		this.category = _category;
	}
	
	private long id;
	private String name;
	private long phone;
	private String email;
	private String postal_address;
	private long postal_code;
	private long url;
	private long district;
	private long category;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPostal_address() {
		return postal_address;
	}

	public void setPostal_address(String postal_address) {
		this.postal_address = postal_address;
	}

	public long getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(long postal_code) {
		this.postal_code = postal_code;
	}

	public long getUrl() {
		return url;
	}

	public void setUrl(long url) {
		this.url = url;
	}

	public long getDistrict() {
		return district;
	}

	public void setDistrict(long district) {
		this.district = district;
	}

	public long getCategory() {
		return category;
	}

	public void setCategory(long category) {
		this.category = category;
	}

}
