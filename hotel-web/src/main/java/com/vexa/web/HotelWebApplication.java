package com.vexa.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.vexa.catalog.service.AdminProductService;

@SpringBootApplication(scanBasePackages = {
    "com.vexa.web" // Add entity package here
		,  "com.vexa.catalg.service"
})
@Import(AdminProductService.class)
@EnableJpaRepositories(basePackages = "com.vexa.catalog.repository")
@EntityScan(basePackages = "com.vexa.org.application.entity")

public class HotelWebApplication  {

    public static void main(String[] args) {
        SpringApplication.run(HotelWebApplication.class, args);
    }

}