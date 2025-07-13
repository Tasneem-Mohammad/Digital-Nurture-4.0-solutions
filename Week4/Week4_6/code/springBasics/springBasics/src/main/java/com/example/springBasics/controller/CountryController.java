package com.example.springBasics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBasics.entity.Country;
import com.example.springBasics.service.CountryServicee;

@RestController
public class CountryController {
	
	 @Autowired
	 private CountryServicee countryService;

	    @GetMapping("/countries/{code}")
	    public Country getCountry(@PathVariable String code) {
	        return countryService.getCountry(code);
	    }
	    
	    
	    @GetMapping("/countries")
	    public List<Country> getCountry() {
	        return countryService.getAllCountries();
	    }
	
}
