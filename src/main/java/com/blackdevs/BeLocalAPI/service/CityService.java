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
	private CityRepository repoCity;

	@Autowired
	@Qualifier("cityConverter")
	private CityConverter converter;
	
	public boolean insert(City city) {
		try {
			repoCity.save(city);			
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean update(City city) {
		try {
			repoCity.save(city);
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean deletebyId(long id) {
		try {
			City city= repoCity.findById(id);
			repoCity.delete(city);			
			return true;			
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public MCity getbyId(long id) {
		try {
			City city = repoCity.findById(id);			
			return new MCity(city);			
		} catch(Exception e) {
			// va logger de error
			return null;
		}
	}
	
	public List<MCity> getAll() {
		return converter.ListCity(repoCity.findAll());
	}
}
