package com.vexa.catalog.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vexa.catalog.repository.ProductJpaRepository;
import com.vexa.org.application.dto.ProductDTO;
import com.vexa.org.application.mapper.ProductMapper;

@Service
public class AdminProductService {
    private final ProductJpaRepository productRepository;

    public AdminProductService(ProductJpaRepository productRepository) {
        this.productRepository = productRepository;
    }
   
   public List<ProductDTO> getAllProduct() {
	   
	   var productList = productRepository.findAll();
	   
	   
	   return productList.stream().map(ProductMapper::toProductDTO).toList();
   }
}
