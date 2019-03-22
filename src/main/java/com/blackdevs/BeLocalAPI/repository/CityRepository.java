package com.blackdevs.BeLocalAPI.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blackdevs.BeLocalAPI.entity.City;

@Repository("cityRepository")
public interface CityRepository  extends JpaRepository<City, Serializable>{
	public abstract City findById(long id);
	
	public abstract List<City> findByName(String name);
}
