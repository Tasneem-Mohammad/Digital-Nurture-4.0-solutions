package com.cognizant.account;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class AccountController {
	
	@GetMapping("/accounts/{number}")
	public  Map<String, Object> getAccNo(@PathVariable String number) {
		 return Map.of(
	                "number", number,
	                "type", "savings",
	                "balance", 234343
	        );
	}
	

}
