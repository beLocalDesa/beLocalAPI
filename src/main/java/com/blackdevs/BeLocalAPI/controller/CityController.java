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

import com.blackdevs.BeLocalAPI.entity.City;
import com.blackdevs.BeLocalAPI.model.MCity;
import com.blackdevs.BeLocalAPI.service.CityService;

@RestController
@RequestMapping("/v1")
public class CityController {
	
	@Autowired
	@Qualifier("cityService")
	CityService service;
	@PutMapping("/city")
	public boolean agregar(@RequestBody @Valid City city)
	{
		return service.insertar(city);
	}
	
	@PostMapping("/city")
	public boolean actualizar(@RequestBody @Valid City category)
	{
		return service.actualizar(category);
	}
	
	@DeleteMapping("/city/{id}")
	public boolean borrar(long id) 
	{
		return service.borrar(id);
	}
	
	@GetMapping("/city/{id}")
	public MCity traerPorID(long id)
	{
		return service.traerPorID(id);
	}
	
	@GetMapping("/cities")
	public List<MCity> traerTodos()
	{
		return service.traerTodos();
	}
}
