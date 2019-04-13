package com.blackdevs.BeLocalAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.blackdevs.BeLocalAPI.converter.StoreConverter;
import com.blackdevs.BeLocalAPI.entity.Store;
import com.blackdevs.BeLocalAPI.model.MStore;
import com.blackdevs.BeLocalAPI.repository.StoreRepository;

@Service("storeService")
public class StoreService {
	@Autowired
	@Qualifier("storeRepository")
	private StoreRepository repoStore;

	@Autowired
	@Qualifier("storeConverter")
	private StoreConverter converter;
	
	public boolean insert(Store store) {
		try {
			repoStore.save(store);		
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean update(Store store) {
		try {
			repoStore.save(store);
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean deletebyId(long id) {
		try {
			Store store = repoStore.findById(id);		
			repoStore.delete(store);			
			return true;			
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public MStore getbyId(long id) {
		try {
			Store store = repoStore.findById(id);			
			return new MStore(store);			
		} catch(Exception e) {
			// va logger de error
			return null;
		}
	}
	
	public List<MStore> getAll() {
		return converter.ListStore(repoStore.findAll());
	}

	public List<MStore> getbyName(String name) {
		return converter.ListStore(repoStore.findByName(name));
	}
	
	public List<MStore> getbyCategory(long category) {
		return converter.ListStore(repoStore.findByCategory(category));
	}
	
	public List<MStore> getbyDistrict(long district) {
		return converter.ListStore(repoStore.findByDistrict(district));
	}
}
