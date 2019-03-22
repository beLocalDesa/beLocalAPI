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
	private ProductRepository repositorio;

	@Autowired
	@Qualifier("productConverter")
	private ProductConverter converter;
	
	public boolean insertar(Product product) {
		try {
			repositorio.save(product);
			
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean actualizar(Product product) {
		try {
			repositorio.save(product);
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean borrar(long id) {
		try {
			Product product= repositorio.findById(id);
			
			repositorio.delete(product);
			
			return true;			
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public MProduct traerPorID(long id) {
		try {
			Product product = repositorio.findById(id);
			
			return new MProduct(product);			
		} catch(Exception e) {
			// va logger de error
			return null;
		}
	}
	
	public List<MProduct> traerTodos() {
		return converter.Lista(repositorio.findAll());
	}
	
	public List<MProduct> traerPorNombre(String name) {
		return converter.Lista(repositorio.findByName(name));
	}
	
	public List<MProduct> traerPorStore(long store) {
		return converter.Lista(repositorio.findByShop(store));
	}
}
