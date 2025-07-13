package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);
	
	
	public static void displayCountry() {
	    System.out.println("Inside displayCountry");
	    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	    Country country = context.getBean("country", Country.class);
	    System.out.println("Country = " + country);
=	}

	
	
	public static void main(String[] args) {
		
		logger.info("main() method started :) ");
		displayCountry();
	}

}
