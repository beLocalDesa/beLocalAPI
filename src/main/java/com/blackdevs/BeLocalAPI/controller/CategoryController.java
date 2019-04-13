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
	public boolean insert(@RequestBody @Valid Category category)
	{
		return service.insert(category);
	}
	
	@PostMapping("/category")
	public boolean update(@RequestBody @Valid Category category)
	{
		return service.update(category);
	}
	
	@DeleteMapping("/category/{id}")
	public boolean deletebyId(long id)
	{
		return service.deletebyId(id);
	}
	
	@GetMapping("/category/{id}")
	public MCategory getbyId(long id)
	{
		return service.getbyId(id);
	}
	
	@GetMapping("/categories")
	public List<MCategory> getAll()
	{
		return service.getAll();
	}
}
