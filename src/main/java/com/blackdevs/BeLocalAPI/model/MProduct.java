package com.blackdevs.BeLocalAPI.model;

import com.blackdevs.BeLocalAPI.entity.Product;

public class MProduct {
	
	public MProduct() {

	}

	public MProduct(Product product) {
		this.id = product.getId();
		this.name = product.getName();
		this.shop = product.getShop();	
		this.URL = product.getURL();
		this.id_category = product.getIdcategory();
		this.id_subcategory = product.getIdsubcategory();
		this.description = product.getDescription();
		this.price = product.getPrice();
		this.stock = product.getStock();
		
	}
	
	public MProduct(long _id, String _name, long _shop, String _URL, long _idcategory, long _idsubcategory, String _description, int _price, int _stock) {
		this.id = _id;
		this.name = _name;
		this.shop = _shop;
		this.URL = _URL;
		this.id_category = _idcategory ; 
		this.id_subcategory = _idsubcategory;
		this.description = _description;
		this.price = _price;
		this.stock = _stock;
	}
	
	private long id;
	private String name;
	private long shop;
	private String URL; 
	private long id_category; 
	private long id_subcategory;
	private String description; 
	private int price; 
	private int stock;
	
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

	public String getURL() {
		return URL;
	}
	
	public long getIdcategory() {
		return id_category;
	}
	
	public long getIdsubcategory() {
		return id_subcategory;
	}

	public String getDescription() {
		return description;
	}
	
	public int getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}
	
	public void setURL(String URL) {
		this.URL = URL;
	}

	public void setIdcategory(long id_category) {
		this.id_category = id_category;
	}
	
	public void setIdsubcategory(long id_subcategory) {
		this.id_subcategory = id_subcategory;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
}
