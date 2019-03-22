package com.blackdevs.BeLocalAPI.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blackdevs.BeLocalAPI.entity.District;

@Repository("districtRepository")
public interface DistrictRepository  extends JpaRepository<District, Serializable>{
	public abstract District findById(long id);
	
	public abstract List<District> findByName(String name);
}
