package com.blackdevs.BeLocalAPI.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.blackdevs.BeLocalAPI.entity.Category;
import com.blackdevs.BeLocalAPI.model.MCategory;

@Component("categoryConverter")
public class CategoryConverter {
	public List<MCategory> ListCat(List<Category> categories) {
		List<MCategory> mcategories = new ArrayList<>();
		
		for(Category category : categories) {
			mcategories.add(new MCategory(category));
		}
		
		return mcategories;
	}
}
