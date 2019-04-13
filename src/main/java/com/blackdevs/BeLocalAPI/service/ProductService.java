package com.blackdevs.BeLocalAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.blackdevs.BeLocalAPI.converter.ProductConverter;
import com.blackdevs.BeLocalAPI.entity.Product;
import com.blackdevs.BeLocalAPI.model.MProduct;
import com.blackdevs.BeLocalAPI.repository.ProductRepository;

@Service("productService")
public class ProductService {
	@Autowired
	@Qualifier("productRepository")
	private ProductRepository repoProd;

	@Autowired
	@Qualifier("productConverter")
	private ProductConverter converter;
	
	public boolean insert(Product product) {
		try {
			repoProd.save(product);			
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean update(Product product) {
		try {
			repoProd.save(product);
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean deletebyId(long id) {
		try {
			Product product= repoProd.findById(id);			
			repoProd.delete(product);			
			return true;			
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public MProduct getbyId(long id) {
		try {
			Product product = repoProd.findById(id);
			
			return new MProduct(product);			
		} catch(Exception e) {
			// va logger de error
			return null;
		}
	}
	
	public List<MProduct> getAll() {
		return converter.ListProd(repoProd.findAll());
	}
	
	public List<MProduct> getbyName(String name) {
		return converter.ListProd(repoProd.findByName(name));
	}
	
	public List<MProduct> getbyStore(long store) {
		return converter.ListProd(repoProd.findByShop(store));
	}
}
