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
	public boolean agregar(@RequestBody @Valid Product product)
	{
		return service.insertar(product);
	}
	
	@PostMapping("/product")
	public boolean actualizar(@RequestBody @Valid Product product)
	{
		return service.actualizar(product);
	}
	
	@DeleteMapping("/product/{id}")
	public boolean borrar(long id) 
	{
		return service.borrar(id);
	}
	
	@GetMapping("/product/{id}")
	public MProduct traerPorID(long id)
	{
		return service.traerPorID(id);
	}
	
	@GetMapping("/products")
	public List<MProduct> traerTodos()
	{
		return service.traerTodos();
	}
}
