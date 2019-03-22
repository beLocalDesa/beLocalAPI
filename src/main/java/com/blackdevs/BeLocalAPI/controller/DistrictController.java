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

import com.blackdevs.BeLocalAPI.entity.District;
import com.blackdevs.BeLocalAPI.model.MDistrict;
import com.blackdevs.BeLocalAPI.service.DistrictService;

@RestController
@RequestMapping("/v1")
public class DistrictController {

	@Autowired
	@Qualifier("districtService")
	DistrictService service;
	@PutMapping("/district")
	public boolean agregar(@RequestBody @Valid District district)
	{
		return service.insertar(district);
	}
	
	@PostMapping("/district")
	public boolean actualizar(@RequestBody @Valid District district)
	{
		return service.actualizar(district);
	}
	
	@DeleteMapping("/district/{id}")
	public boolean borrar(long id) 
	{
		return service.borrar(id);
	}
	
	@GetMapping("/district/{id}")
	public MDistrict traerPorID(long id)
	{
		return service.traerPorID(id);
	}
	
	@GetMapping("/districts")
	public List<MDistrict> traerTodos()
	{
		return service.traerTodos();
	}
}
