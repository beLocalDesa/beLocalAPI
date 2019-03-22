package com.blackdevs.BeLocalAPI.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blackdevs.BeLocalAPI.entity.Store;

@Repository("storeRepository")
public interface StoreRepository  extends JpaRepository<Store, Serializable>{
	public abstract Store findById(long id);
	
	public abstract List<Store> findByName(String name);
	
	public abstract List<Store> findByCategory(long category);
	
	public abstract List<Store> findByDistrict(long district);

}
