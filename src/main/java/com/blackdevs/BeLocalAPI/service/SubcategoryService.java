package com.blackdevs.BeLocalAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.blackdevs.BeLocalAPI.converter.SubcategoryConverter;
import com.blackdevs.BeLocalAPI.entity.Subcategory;
import com.blackdevs.BeLocalAPI.model.MSubcategory;
import com.blackdevs.BeLocalAPI.repository.SubcategoryRepository;

@Service("subcategoryService")
public class SubcategoryService {
	@Autowired
	@Qualifier("subcategoryRepository")
	private SubcategoryRepository repositorio;

	@Autowired
	@Qualifier("subcategoryConverter")
	private SubcategoryConverter converter;
	
	public boolean insertar(Subcategory subcategory) {
		try {
			repositorio.save(subcategory);
			
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean actualizar(Subcategory subcategory) {
		try {
			repositorio.save(subcategory);
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean borrar(long id) {
		try {
			Subcategory subcategory = repositorio.findById(id);
			
			repositorio.delete(subcategory);
			
			return true;			
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public MSubcategory traerPorID(long id) {
		try {
			Subcategory subcategory = repositorio.findById(id);
			
			return new MSubcategory(subcategory);			
		} catch(Exception e) {
			// va logger de error
			return null;
		}
	}
	
	public List<MSubcategory> traerTodos() {
		return converter.Lista(repositorio.findAll());
	}

	public List<MSubcategory> traerPorNombre(String name) {
		return converter.Lista(repositorio.findByName(name));
	}

	public List<MSubcategory> traerPorCategory(long category) {
		return converter.Lista(repositorio.findByCategory(category));
	}
}
