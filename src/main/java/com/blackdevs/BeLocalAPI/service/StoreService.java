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
	private StoreRepository repositorio;

	@Autowired
	@Qualifier("storeConverter")
	private StoreConverter converter;
	
	public boolean insertar(Store store) {
		try {
			repositorio.save(store);
			
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean actualizar(Store store) {
		try {
			repositorio.save(store);
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean borrar(long id) {
		try {
			Store store = repositorio.findById(id);
			
			repositorio.delete(store);
			
			return true;			
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public MStore traerPorID(long id) {
		try {
			Store store = repositorio.findById(id);
			
			return new MStore(store);			
		} catch(Exception e) {
			// va logger de error
			return null;
		}
	}
	
	public List<MStore> traerTodos() {
		return converter.Lista(repositorio.findAll());
	}

	public List<MStore> traerPorNombre(String name) {
		return converter.Lista(repositorio.findByName(name));
	}
	
	public List<MStore> traerPorCategory(long category) {
		return converter.Lista(repositorio.findByCategory(category));
	}
	
	public List<MStore> traerPorDistrict(long district) {
		return converter.Lista(repositorio.findByDistrict(district));
	}
}
