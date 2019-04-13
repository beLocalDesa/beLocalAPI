package com.blackdevs.BeLocalAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.blackdevs.BeLocalAPI.entity.Urlfriendly;
import com.blackdevs.BeLocalAPI.model.MUrlfriendly;
import com.blackdevs.BeLocalAPI.repository.UrlfriendlyRepository;

@Service("urlfriendlyService")
public class UrlfriendlyService {
	@Autowired
	@Qualifier("urlfriendlyRepository")
	private UrlfriendlyRepository repoURL;
	
	public boolean insert(Urlfriendly urlfriendly) {
		try {
			repoURL.save(urlfriendly);
			
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean update(Urlfriendly urlfriendly) {
		try {
			repoURL.save(urlfriendly);
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean deletebyId(long id) {
		try {
			Urlfriendly urlfriendly = repoURL.findById(id);	
			repoURL.delete(urlfriendly);		
			return true;			
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public MUrlfriendly getbyId(long id) {
		try {
			Urlfriendly urlfriendly = repoURL.findById(id);			
			return new MUrlfriendly(urlfriendly);			
		} catch(Exception e) {
			// va logger de error
			return null;
		}
	}
}
