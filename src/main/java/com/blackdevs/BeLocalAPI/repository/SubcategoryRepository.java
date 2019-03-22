package com.blackdevs.BeLocalAPI.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blackdevs.BeLocalAPI.entity.Subcategory;

@Repository("subcategoryRepository")
public interface SubcategoryRepository  extends JpaRepository<Subcategory, Serializable>{
	public abstract Subcategory findById(long id);
	
	public abstract List<Subcategory> findByName(String name);
	
	public abstract List<Subcategory> findByCategory(long category);
}
