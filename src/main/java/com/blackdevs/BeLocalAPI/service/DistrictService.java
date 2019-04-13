package com.blackdevs.BeLocalAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.blackdevs.BeLocalAPI.converter.DistrictConverter;
import com.blackdevs.BeLocalAPI.entity.District;
import com.blackdevs.BeLocalAPI.model.MDistrict;
import com.blackdevs.BeLocalAPI.repository.DistrictRepository;

@Service("districtService")
public class DistrictService {
	@Autowired
	@Qualifier("districtRepository")
	private DistrictRepository repoDist;

	@Autowired
	@Qualifier("districtConverter")
	private DistrictConverter converter;
	
	public boolean insert(District district) {
		try {
			repoDist.save(district);			
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean update(District district) {
		try {
			repoDist.save(district);
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean deletebyId(long id) {
		try {
			District district= repoDist.findById(id);			
			repoDist.delete(district);			
			return true;			
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public MDistrict getbyId(long id) {
		try {
			District district = repoDist.findById(id);			
			return new MDistrict(district);			
		} catch(Exception e) {
			// va logger de error
			return null;
		}
	}
	
	public List<MDistrict> getAll() {
		return converter.ListDist(repoDist.findAll());
	}

}
