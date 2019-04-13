package com.blackdevs.BeLocalAPI.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.blackdevs.BeLocalAPI.entity.Subcategory;
import com.blackdevs.BeLocalAPI.model.MSubcategory;

@Component("subcategoryConverter")
public class SubcategoryConverter {
	public List<MSubcategory> ListSc(List<Subcategory> subcategories) {
		List<MSubcategory> msubcategories = new ArrayList<>();
		
		for(Subcategory subcategory : subcategories) {
			msubcategories.add(new MSubcategory(subcategory));
		}
		
		return msubcategories;
	}
}
