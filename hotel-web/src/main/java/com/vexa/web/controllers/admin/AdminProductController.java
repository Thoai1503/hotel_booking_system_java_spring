package com.vexa.web.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vexa.catalog.repository.ProductRepository;

@Controller

@RequestMapping("/admin")
public class AdminProductController {
	
	@Autowired ProductRepository productRepository;
	
	@GetMapping("product")
    public String getProduct() {
    	return "admin/catalog/room-type";
    }   
}
