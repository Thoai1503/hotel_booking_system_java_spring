package com.vexa.org.application.mapper;

import com.vexa.org.application.dto.ProductDTO;
import com.vexa.org.application.entity.Product;

public class ProductMapper {

	
	public static ProductDTO toProductDTO(Product product) {
		ProductDTO productDTO =new ProductDTO();
		product.setIdProduct(product.getIdProduct());
		product.setIdCategoryDefault(product.getIdCategoryDefault());
		product.setIdSupplier(product.getIdSupplier());
		product.setIdShopDefault(product.getIdShopDefault());
		
		return productDTO;
	}
	  
	
}
