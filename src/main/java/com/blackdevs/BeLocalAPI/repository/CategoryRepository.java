package com.blackdevs.BeLocalAPI.repository;

import com.blackdevs.BeLocalAPI.entity.Category;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository<Category, Serializable>{
	public abstract Category findById(long id);
	
	public abstract List<Category> findByName(String name);
}
