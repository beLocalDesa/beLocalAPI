package com.blackdevs.BeLocalAPI.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.blackdevs.BeLocalAPI.entity.Product;
import com.blackdevs.BeLocalAPI.model.MProduct;

@Component("productConverter")
public class ProductConverter {
	public List<MProduct> Lista(List<Product> products) {
		List<MProduct> mproducts = new ArrayList<>();
		
		for(Product product : products) {
			mproducts.add(new MProduct(product));
		}
		
		return mproducts;
	}
}
