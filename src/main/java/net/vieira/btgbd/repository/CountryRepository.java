package net.vieira.btgbd.repository;

import java.util.Collection;

import net.vieira.btgbd.model.Country;

import org.springframework.dao.DataAccessException;

public interface CountryRepository {

	Collection<Country> findAll() throws DataAccessException;
	
	Collection<Country> findByName(String name) throws DataAccessException;
	
	Country findById(Integer id) throws DataAccessException;
	
	void save(Country country) throws DataAccessException;
}
