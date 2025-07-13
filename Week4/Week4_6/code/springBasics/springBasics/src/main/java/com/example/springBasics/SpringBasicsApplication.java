package com.example.springBasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:country.xml")
public class SpringBasicsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBasicsApplication.class, args);
    }
}
