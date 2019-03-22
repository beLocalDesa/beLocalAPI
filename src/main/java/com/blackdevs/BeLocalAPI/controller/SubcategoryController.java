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

import com.blackdevs.BeLocalAPI.entity.Subcategory;
import com.blackdevs.BeLocalAPI.model.MSubcategory;
import com.blackdevs.BeLocalAPI.service.SubcategoryService;

@RestController
@RequestMapping("/v1")
public class SubcategoryController {

	@Autowired
	@Qualifier("subcategoryService")
	SubcategoryService service;
	@PutMapping("/subcategory")
	public boolean agregar(@RequestBody @Valid Subcategory subcategory)
	{
		return service.insertar(subcategory);
	}
	
	@PostMapping("/subcategory")
	public boolean actualizar(@RequestBody @Valid Subcategory subcategory)
	{
		return service.actualizar(subcategory);
	}
	
	@DeleteMapping("/subcategory/{id}")
	public boolean borrar(long id) 
	{
		return service.borrar(id);
	}
	
	@GetMapping("/subcategory/{id}")
	public MSubcategory traerPorID(long id)
	{
		return service.traerPorID(id);
	}
	
	@GetMapping("/subcategories")
	public List<MSubcategory> traerTodos()
	{
		return service.traerTodos();
	}
}
