package net.vieira.btgbd.service.impl;

import java.util.Collection;

import net.vieira.btgbd.model.Country;
import net.vieira.btgbd.repository.CountryRepository;
import net.vieira.btgbd.service.CountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CountryServiceImpl implements CountryService {
	
	private CountryRepository countryRepository;

	@Autowired
	public CountryServiceImpl(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

    @Override
    @Transactional(readOnly = true)
    @Cacheable(value = "vets")
    public Collection<Country> findAll() throws DataAccessException {
        return countryRepository.findAll();
    }

	@Override
    @Transactional(readOnly = true)
	public Collection<Country> findByName(String name) throws DataAccessException {
		return countryRepository.findByName(name);
	}

	@Override
    @Transactional(readOnly = true)
	public Country findById(Integer id) throws DataAccessException {
		return countryRepository.findById(id);
	}

	@Override
    @Transactional
	public void save(Country country) throws DataAccessException {
		countryRepository.save(country);
	}

}
