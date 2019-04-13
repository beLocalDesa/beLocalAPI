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
	
	public Product(long _id, String _name, long _shop, String _URL, long _idcategory, long _idsubcategory, String _description, int _price, int _stock) {
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
	@GeneratedValue
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="shop")
	private long shop;

	@Column(name="URL")
	private String URL;

	@Column(name="id_category")
	private long id_category;
	
	@Column(name="id_subcategory")
	private long id_subcategory;
	
	@Column(name="description")
	private String description;
	
	@Column(name="price")
	private int price;
	
	@Column(name="stock")
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
