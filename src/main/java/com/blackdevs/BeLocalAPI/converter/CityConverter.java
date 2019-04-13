package com.blackdevs.BeLocalAPI.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.blackdevs.BeLocalAPI.entity.City;
import com.blackdevs.BeLocalAPI.model.MCity;

@Component("cityConverter")
public class CityConverter {
	public List<MCity> ListCity(List<City> categories) {
		List<MCity> mcities = new ArrayList<>();
		
		for(City city : categories) {
			mcities.add(new MCity(city));
		}
		
		return mcities;
	}
}
