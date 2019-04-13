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

import com.blackdevs.BeLocalAPI.entity.Store;
import com.blackdevs.BeLocalAPI.model.MStore;
import com.blackdevs.BeLocalAPI.service.StoreService;

@RestController
@RequestMapping("/v1")
public class StoreController {

	@Autowired
	@Qualifier("storeService")
	StoreService service;
	@PutMapping("/store")
	public boolean insert(@RequestBody @Valid Store store)
	{
		return service.insert(store);
	}
	
	@PostMapping("/store")
	public boolean update(@RequestBody @Valid Store store)
	{
		return service.update(store);
	}
	
	@DeleteMapping("/store/{id}")
	public boolean deletebyId(long id) 
	{
		return service.deletebyId(id);
	}
	
	@GetMapping("/store/{name}")
	public List<MStore>  getbyName(String name)
	{
		return service.getbyName(name);
	}
	
	@GetMapping("/shop")
	public List<MStore> getAll()
	{
		return service.getAll();
	}
}
