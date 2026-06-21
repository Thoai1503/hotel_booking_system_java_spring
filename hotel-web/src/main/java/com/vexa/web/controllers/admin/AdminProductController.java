package com.vexa.web.controllers.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String getProduct(Model model) {
		
		var list = adminProductService.getAllProduct();
		LOGGER.info("Length: "+ list.size());
		list.forEach(p -> LOGGER.info(p.toString()));
		
	     model.addAttribute("products", list);
    	return "admin/catalog/room-type";
    }   
}
