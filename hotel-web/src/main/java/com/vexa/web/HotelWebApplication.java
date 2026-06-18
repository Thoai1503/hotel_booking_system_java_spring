package com.vexa.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.vexa.catalog.repository.ProductRepository;

//@SpringBootApplication(scanBasePackages = {
//	    "com.vexa.catalog",
//	    "com.vexa.web"
//	})
@SpringBootApplication
@Import(ProductRepository.class)
public class HotelWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelWebApplication.class, args);
	}

}
