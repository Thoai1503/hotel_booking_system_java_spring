package com.vexa.catalog;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vexa.catalog.repository.ProductRepository;
import com.vexa.org.entity.Product;

@SpringBootApplication
public class CatalogModuleApplication {


    
	public static void main(String[] args) {
	//System.out.print("Conneted: "+ productRepository);
		SpringApplication.run(CatalogModuleApplication.class, args);
	}

}
