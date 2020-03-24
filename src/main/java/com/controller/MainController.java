package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.modal.CountryDetails;
import com.service.CountryService;

@Controller
public class MainController {
	
	
    @Autowired
	CountryService Service;
	
	@RequestMapping("/")
	public void get() {
		System.out.println(Service.suggest("in"));
		System.out.println(Service.suggestbysort("in"));
		System.out.println(Service.suggestbyletter("i"));
	}
	
}
