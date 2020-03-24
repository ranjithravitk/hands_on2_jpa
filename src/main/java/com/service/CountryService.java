package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modal.CountryDetails;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
	@Transactional
	public List<CountryDetails>  suggest (String s){
		return countryRepository.findBycountryNameContaining(s);
	}
	@Transactional
	public List<CountryDetails>  suggestbysort (String s){
		return countryRepository.findBycountryNameOrderBycountryNameAsc(s);
	}
	@Transactional
	public List<CountryDetails>  suggestbyletter(String s){
		return countryRepository.findBycountryletter(s);
	}
}
