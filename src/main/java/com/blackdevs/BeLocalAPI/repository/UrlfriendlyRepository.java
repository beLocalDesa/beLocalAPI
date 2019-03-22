package com.blackdevs.BeLocalAPI.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blackdevs.BeLocalAPI.entity.Urlfriendly;;

@Repository("urlfriendlyRepository")
public interface UrlfriendlyRepository  extends JpaRepository<Urlfriendly, Serializable>{
	public abstract Urlfriendly findById(long id);
}
