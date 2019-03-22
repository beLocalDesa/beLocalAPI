package com.blackdevs.BeLocalAPI.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.blackdevs.BeLocalAPI.entity.District;
import com.blackdevs.BeLocalAPI.model.MDistrict;

@Component("districtConverter")
public class DistrictConverter {
	public List<MDistrict> Lista(List<District> districts) {
		List<MDistrict> mdistricts = new ArrayList<>();
		
		for(District district : districts) {
			mdistricts.add(new MDistrict(district));
		}
		
		return mdistricts;
	}
}
