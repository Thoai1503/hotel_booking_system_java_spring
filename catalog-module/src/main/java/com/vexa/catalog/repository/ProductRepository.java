package com.vexa.catalog.repository;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vexa.org.entity.Product;

@Repository
public class ProductRepository  {
//    @Autowired
//    private DataSource dataSource;
//    private Product currentProduct;
//    
//    public ProductRepository() {
//    	currentProduct = new Product(1L, dataSource);
//    }
	 private final DataSource dataSource;
	    public Product getCurrentProduct() {
		return this. currentProduct;
	}

		private  Product currentProduct;

	    @Autowired
	    public ProductRepository(DataSource dataSource) {
	        this.dataSource = dataSource;
	        this.currentProduct = new Product(1L, dataSource);
	    }
	    
	    
    
    
}
