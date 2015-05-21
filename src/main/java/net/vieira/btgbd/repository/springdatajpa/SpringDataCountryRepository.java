/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.vieira.btgbd.repository.springdatajpa;

import java.util.Collection;

import net.vieira.btgbd.model.Country;
import net.vieira.btgbd.repository.CountryRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

/**
 * Spring Data JPA specialization of the {@link CountryRepository} interface
 *
 * @author Michael Isvy
 * @since 15.1.2013
 */
public interface SpringDataCountryRepository extends CountryRepository, Repository<Country, Integer> {
		
		@Override
	    @Query("SELECT DISTINCT country FROM Country country WHERE country.country LIKE :country%")
	    public Collection<Country> findByName(@Param("country") String country);
		
		@Override
		@Query("SELECT country FROM Country country WHERE country.id =:id")
		public Country findById(@Param("id") Integer id);
}
