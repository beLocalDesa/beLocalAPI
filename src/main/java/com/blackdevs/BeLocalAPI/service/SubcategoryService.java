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
	private SubcategoryRepository repoSubc;

	@Autowired
	@Qualifier("subcategoryConverter")
	private SubcategoryConverter converter;
	
	public boolean insert(Subcategory subcategory) {
		try {
			repoSubc.save(subcategory);			
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean update(Subcategory subcategory) {
		try {
			repoSubc.save(subcategory);
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean deletebyId(long id) {
		try {
			Subcategory subcategory = repoSubc.findById(id);			
			repoSubc.delete(subcategory);			
			return true;			
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public MSubcategory getbyId(long id) {
		try {
			Subcategory subcategory = repoSubc.findById(id);			
			return new MSubcategory(subcategory);			
		} catch(Exception e) {
			// va logger de error
			return null;
		}
	}
	
	public List<MSubcategory> getAll() {
		return converter.ListSc(repoSubc.findAll());
	}

	public List<MSubcategory> getbyName(String name) {
		return converter.ListSc(repoSubc.findByName(name));
	}

	public List<MSubcategory> getbyCategory(long category) {
		return converter.ListSc(repoSubc.findByCategory(category));
	}
}
