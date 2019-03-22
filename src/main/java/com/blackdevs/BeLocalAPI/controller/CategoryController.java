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

import com.blackdevs.BeLocalAPI.entity.Category;
import com.blackdevs.BeLocalAPI.model.MCategory;
import com.blackdevs.BeLocalAPI.service.CategoryService;

@RestController
@RequestMapping("/v1")
public class CategoryController {
	
	@Autowired
	@Qualifier("categoryService")
	CategoryService service;

	@PutMapping("/category")
	public boolean agregar(@RequestBody @Valid Category category)
	{
		return service.insertar(category);
	}
	
	@PostMapping("/category")
	public boolean actualizar(@RequestBody @Valid Category category)
	{
		return service.actualizar(category);
	}
	
	@DeleteMapping("/category/{id}")
	public boolean borrar(long id) 
	{
		return service.borrar(id);
	}
	
	@GetMapping("/category/{id}")
	public MCategory traerPorID(long id)
	{
		return service.traerPorID(id);
	}
	
	@GetMapping("/categories")
	public List<MCategory> traerTodos()
	{
		return service.traerTodos();
	}
}
