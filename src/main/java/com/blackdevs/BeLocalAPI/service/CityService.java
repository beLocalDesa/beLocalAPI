package com.blackdevs.BeLocalAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.blackdevs.BeLocalAPI.converter.CityConverter;
import com.blackdevs.BeLocalAPI.entity.City;
import com.blackdevs.BeLocalAPI.model.MCity;
import com.blackdevs.BeLocalAPI.repository.CityRepository;

@Service("cityService")
public class CityService {
	@Autowired
	@Qualifier("cityRepository")
	private CityRepository repositorio;

	@Autowired
	@Qualifier("cityConverter")
	private CityConverter converter;
	
	public boolean insertar(City city) {
		try {
			repositorio.save(city);
			
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean actualizar(City city) {
		try {
			repositorio.save(city);
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean borrar(long id) {
		try {
			City city= repositorio.findById(id);
			
			repositorio.delete(city);
			
			return true;			
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public MCity traerPorID(long id) {
		try {
			City city = repositorio.findById(id);
			
			return new MCity(city);			
		} catch(Exception e) {
			// va logger de error
			return null;
		}
	}
	
	public List<MCity> traerTodos() {
		return converter.Lista(repositorio.findAll());
	}
}
