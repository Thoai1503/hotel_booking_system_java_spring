package com.vexa.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Import;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.vexa.catalog.repository.ProductJpaRepository;
import com.vexa.catalog.service.AdminProductService;


//@SpringBootApplication(scanBasePackages = {
//	    "com.vexa.catalog",
//	    "com.vexa.web"
//	})
@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.vexa.catalog.repository")
//@org.springframework.boot.persistence.autoconfigure.EntityScan(basePackages = "com.vexa.org.application.entity")
@Import({AdminProductService.class})
public class HotelWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelWebApplication.class, args);
	}

}
