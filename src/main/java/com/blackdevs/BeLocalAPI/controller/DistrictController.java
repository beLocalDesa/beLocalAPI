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
	public boolean insert(@RequestBody @Valid District district)
	{
		return service.insert(district);
	}
	
	@PostMapping("/district")
	public boolean update(@RequestBody @Valid District district)
	{
		return service.update(district);
	}
	
	@DeleteMapping("/district/{id}")
	public boolean deletebyId(long id) 
	{
		return service.deletebyId(id);
	}
	
	@GetMapping("/district/{id}")
	public MDistrict getbyId(long id)
	{
		return service.getbyId(id);
	}
	
	@GetMapping("/districts")
	public List<MDistrict> getAll()
	{
		return service.getAll();
	}
}
