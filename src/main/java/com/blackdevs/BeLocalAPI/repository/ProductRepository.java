package com.blackdevs.BeLocalAPI.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blackdevs.BeLocalAPI.entity.Product;;

@Repository("productRepository")
public interface ProductRepository  extends JpaRepository<Product, Serializable>{
	public abstract Product findById(long id);
	
	public abstract List<Product> findByName(String name);
	
	public abstract List<Product> findByShop(long shop);
}
