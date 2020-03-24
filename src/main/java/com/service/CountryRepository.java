package com.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.modal.CountryDetails;
@Repository
public interface CountryRepository extends JpaRepository<CountryDetails, String> {

	
	public List<CountryDetails> findBycountryNameContaining(String country_name);
	
	@Query("select e from CountryDetails e where e.countryName like %?1% order by e.countryName")
	public List<CountryDetails> findBycountryNameOrderBycountryNameAsc(String country_name);
	
	@Query("select e from CountryDetails e where e.countryName like ?1%")
	public List<CountryDetails> findBycountryletter(String letter);
}
