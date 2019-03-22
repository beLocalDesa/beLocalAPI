package com.blackdevs.BeLocalAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.blackdevs.BeLocalAPI.converter.DistrictConverter;
import com.blackdevs.BeLocalAPI.entity.District;
import com.blackdevs.BeLocalAPI.model.MDistrict;
import com.blackdevs.BeLocalAPI.repository.DistrictRepository;

@Service("districtService")
public class DistrictService {
	@Autowired
	@Qualifier("districtRepository")
	private DistrictRepository repositorio;

	@Autowired
	@Qualifier("districtConverter")
	private DistrictConverter converter;
	
	public boolean insertar(District district) {
		try {
			repositorio.save(district);
			
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean actualizar(District district) {
		try {
			repositorio.save(district);
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean borrar(long id) {
		try {
			District district= repositorio.findById(id);
			
			repositorio.delete(district);
			
			return true;			
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public MDistrict traerPorID(long id) {
		try {
			District district = repositorio.findById(id);
			
			return new MDistrict(district);			
		} catch(Exception e) {
			// va logger de error
			return null;
		}
	}
	
	public List<MDistrict> traerTodos() {
		return converter.Lista(repositorio.findAll());
	}

}
