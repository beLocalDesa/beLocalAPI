package com.blackdevs.BeLocalAPI.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.blackdevs.BeLocalAPI.entity.Store;
import com.blackdevs.BeLocalAPI.model.MStore;

@Component("storeConverter")
public class StoreConverter {
	public List<MStore> ListStore(List<Store> shops) {
		List<MStore> mshops = new ArrayList<>();
		
		for(Store store : shops) {
			mshops.add(new MStore(store));
		}
		
		return mshops;
	}
}
