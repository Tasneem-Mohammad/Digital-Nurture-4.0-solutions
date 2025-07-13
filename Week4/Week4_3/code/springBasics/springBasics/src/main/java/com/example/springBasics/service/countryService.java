package com.example.springBasics.service;

import java.util.List;

import org.springframework.context.ApplicationContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springBasics.entity.Country;
@Service
public class countryService {
	 @Autowired
	    private ApplicationContext context;

	    public Country getCountry(String code) {
	        List<Country> countryList = (List<Country>) context.getBean("countryList");

	        return countryList.stream()
	                .filter(c -> c.getCode().equalsIgnoreCase(code))
	                .findFirst()
	                .orElseThrow(() -> new RuntimeException("Country not found for code: " + code));
	    }
}
