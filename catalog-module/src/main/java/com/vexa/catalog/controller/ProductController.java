package com.vexa.catalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vexa.catalog.repository.ProductRepository;
import com.vexa.org.entity.Product;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
	private ProductRepository productRepository;
    
    @GetMapping
    public ResponseEntity test() {
    	Product product=  productRepository.getCurrentProduct();
    	System.out.println(product.getPrice());
    	return ResponseEntity.ok(productRepository.getCurrentProduct());
    }
}
