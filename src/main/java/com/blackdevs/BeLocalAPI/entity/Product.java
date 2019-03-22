package com.blackdevs.BeLocalAPI.entity;

import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Table(name="bl_product")
@Entity
public class Product implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Product() {
	}
	
	public Product(long _id, String _name, long _shop) {
		this.id = _id;
		this.name = _name;
		this.shop = _shop;
	}
	@GeneratedValue
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="shop")
	private long shop;

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

	public long getShop() {
		return shop;
	}

	public void setShop(long shop) {
		this.shop = shop;
	}
	
}
