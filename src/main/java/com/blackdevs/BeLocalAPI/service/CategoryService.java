package com.blackdevs.BeLocalAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.blackdevs.BeLocalAPI.converter.CategoryConverter;
import com.blackdevs.BeLocalAPI.entity.Category;
import com.blackdevs.BeLocalAPI.model.MCategory;
import com.blackdevs.BeLocalAPI.repository.CategoryRepository;

@Service("categoryService")
public class CategoryService {
	@Autowired
	@Qualifier("categoryRepository")
	private CategoryRepository repoCat;

	@Autowired
	@Qualifier("categoryConverter")
	private CategoryConverter converter;
	
	public boolean insert(Category category) {
		try {
			repoCat.save(category);
			
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean update(Category category) {
		try {
			repoCat.save(category);
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean deletebyId(long id) {
		try {
			Category category = repoCat.findById(id);			
			repoCat.delete(category);			
			return true;			
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public MCategory getbyId(long id) {
		try {
			Category category = repoCat.findById(id);			
			return new MCategory(category);			
		} catch(Exception e) {
			// va logger de error
			return null;
		}
	}
	
	public List<MCategory> getAll() {
		return converter.ListCat(repoCat.findAll());
	}
}
