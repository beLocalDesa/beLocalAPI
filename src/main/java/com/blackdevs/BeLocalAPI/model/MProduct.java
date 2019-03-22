package com.blackdevs.BeLocalAPI.model;

import com.blackdevs.BeLocalAPI.entity.Product;

public class MProduct {
	
	public MProduct() {

	}

	public MProduct(Product product) {
		this.id = product.getId();
		this.name = product.getName();
		this.shop = product.getShop();
	}
	
	public MProduct(long _id, String _name, long _shop) {
		this.id = _id;
		this.name = _name;
		this.shop = _shop;
	}
	
	private long id;
	private String name;
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
