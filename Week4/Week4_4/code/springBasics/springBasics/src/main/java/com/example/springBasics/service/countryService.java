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

	    public List<Country> getAllCountries() {
	        return (List<Country>) context.getBean("countryList");
	    }
}
