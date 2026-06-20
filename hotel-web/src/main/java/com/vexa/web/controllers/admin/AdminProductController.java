package com.vexa.web.controllers.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vexa.catalog.service.AdminProductService;

@Controller

@RequestMapping("/admin")
public class AdminProductController {
	private static final Logger LOGGER = LoggerFactory.getLogger(AdminProductController.class);
	
	
	@Autowired
	private AdminProductService adminProductService;
  
	
	@GetMapping("product")
    public String getProduct() {
		
		var list = adminProductService.getAllProduct();
		list.forEach(p -> LOGGER.info(p.toString()));
		
		
    	return "admin/catalog/room-type";
    }   
}
