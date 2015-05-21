package net.vieira.btgbd.service;

import java.util.Collection;

import net.vieira.btgbd.model.Country;

import org.springframework.dao.DataAccessException;

public interface CountryService {


	Collection<Country> findAll() throws DataAccessException;
	
	Collection<Country> findByName(String name) throws DataAccessException;
	
	Country findById(Integer id) throws DataAccessException;
	
	void save(Country country) throws DataAccessException;

}
