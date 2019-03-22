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
	private CategoryRepository repositorio;

	@Autowired
	@Qualifier("categoryConverter")
	private CategoryConverter converter;
	
	public boolean insertar(Category category) {
		try {
			repositorio.save(category);
			
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean actualizar(Category category) {
		try {
			repositorio.save(category);
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean borrar(long id) {
		try {
			Category category = repositorio.findById(id);
			
			repositorio.delete(category);
			
			return true;			
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public MCategory traerPorID(long id) {
		try {
			Category category = repositorio.findById(id);
			
			return new MCategory(category);			
		} catch(Exception e) {
			// va logger de error
			return null;
		}
	}
	
	public List<MCategory> traerTodos() {
		return converter.Lista(repositorio.findAll());
	}
}
