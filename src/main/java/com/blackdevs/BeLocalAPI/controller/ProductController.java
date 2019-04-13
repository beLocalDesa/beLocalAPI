package com.blackdevs.BeLocalAPI.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackdevs.BeLocalAPI.entity.Product;
import com.blackdevs.BeLocalAPI.model.MProduct;
import com.blackdevs.BeLocalAPI.service.ProductService;

@RestController
@RequestMapping("/v1")
public class ProductController {

	@Autowired
	@Qualifier("productService")
	ProductService service;
	@PutMapping("/product")
	public boolean insert(@RequestBody @Valid Product product)
	{
		return service.insert(product);
	}
	
	@PostMapping("/product")
	public boolean update(@RequestBody @Valid Product product)
	{
		return service.update(product);
	}
	
	@DeleteMapping("/product/{id}")
	public boolean deletebyId(long id) 
	{
		return service.deletebyId(id);
	}
	
	@GetMapping("/product/{id}")
	public MProduct getbyId(long id)
	{
		return service.getbyId(id);
	}
	
	@GetMapping("/products")
	public List<MProduct> getAll()
	{
		return service.getAll();
	}
	
}
