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
	public boolean agregar(@RequestBody @Valid Store store)
	{
		return service.insertar(store);
	}
	
	@PostMapping("/store")
	public boolean actualizar(@RequestBody @Valid Store store)
	{
		return service.actualizar(store);
	}
	
	@DeleteMapping("/store/{id}")
	public boolean borrar(long id) 
	{
		return service.borrar(id);
	}
	
	@GetMapping("/store/{id}")
	public MStore traerPorID(long id)
	{
		return service.traerPorID(id);
	}
	
	@GetMapping("/shop")
	public List<MStore> traerTodos()
	{
		return service.traerTodos();
	}
}
