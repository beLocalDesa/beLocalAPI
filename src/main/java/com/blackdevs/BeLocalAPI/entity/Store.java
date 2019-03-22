package com.blackdevs.BeLocalAPI.entity;

import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Table(name="bl_store")
@Entity
public class Store implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Store() {
		
	}
	
	public Store(long _id, String _name, long _phone, String _email, String _postal_address, long _postal_code,
			long _url, long _district, long _category) {
		super();
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
	
	@GeneratedValue
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="phone")
	private long phone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="postal_address")
	private String postal_address;
	
	@Column(name="postal_code")
	private long postal_code;
	
	@Column(name="url")
	private long url;
	
	@Column(name="district")
	private long district;
	
	@Column(name="category")
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
