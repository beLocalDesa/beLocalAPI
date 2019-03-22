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
	private UrlfriendlyRepository repositorio;
	
	public boolean insertar(Urlfriendly urlfriendly) {
		try {
			repositorio.save(urlfriendly);
			
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean actualizar(Urlfriendly urlfriendly) {
		try {
			repositorio.save(urlfriendly);
			return true;
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public boolean borrar(long id) {
		try {
			Urlfriendly urlfriendly = repositorio.findById(id);
			
			repositorio.delete(urlfriendly);
			
			return true;			
		} catch(Exception e) {
			// va logger de error
			return false;
		}
	}
	
	public MUrlfriendly traerPorID(long id) {
		try {
			Urlfriendly urlfriendly = repositorio.findById(id);
			
			return new MUrlfriendly(urlfriendly);			
		} catch(Exception e) {
			// va logger de error
			return null;
		}
	}
}
