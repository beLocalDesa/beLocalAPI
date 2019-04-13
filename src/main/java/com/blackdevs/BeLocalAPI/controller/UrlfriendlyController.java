package com.blackdevs.BeLocalAPI.controller;

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

import com.blackdevs.BeLocalAPI.entity.Urlfriendly;
import com.blackdevs.BeLocalAPI.model.MUrlfriendly;
import com.blackdevs.BeLocalAPI.service.UrlfriendlyService;

@RestController
@RequestMapping("/v1")
public class UrlfriendlyController {

	@Autowired
	@Qualifier("urlfriendlyService")
	UrlfriendlyService service;
	@PutMapping("/urlfriendly")
	public boolean insert(@RequestBody @Valid Urlfriendly urlfriendly)
	{
		return service.insert(urlfriendly);
	}
	
	@PostMapping("/urlfriendly")
	public boolean update(@RequestBody @Valid Urlfriendly urlfriendly)
	{
		return service.update(urlfriendly);
	}
	
	@DeleteMapping("/urlfriendly/{id}")
	public boolean deletebyId(long id) 
	{
		return service.deletebyId(id);
	}
	
	@GetMapping("/urlfriendly/{id}")
	public MUrlfriendly getbyId(long id)
	{
		return service.getbyId(id);
	}
}
