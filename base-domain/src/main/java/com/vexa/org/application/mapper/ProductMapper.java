package com.vexa.org.application.mapper;

import com.vexa.org.application.dto.ProductDTO;
import com.vexa.org.application.entity.Product;

public class ProductMapper {
	
	public static ProductDTO toProductDTO(Product product) {
		if (product == null) {
			return null;
		}
		
		ProductDTO productDTO = new ProductDTO();
		
		// ID fieldstoProductDTO
		productDTO.setIdProduct(product.getIdProduct());
		productDTO.setIdSupplier(product.getIdSupplier());
		productDTO.setIdManufacture(product.getIdManufacturer()); // Note: Entity has idManufacturer, DTO has idManufacture
		productDTO.setIdCategoryDefault(product.getIdCategoryDefault());
		productDTO.setIdShopDefault(product.getIdShopDefault());
		productDTO.setIdTaxRulesGroup(product.getIdTaxRulesGroup());
		
		// Sale & Online fields
		productDTO.setOnSale(product.getOnSale());
		productDTO.setOnlineOnly(product.getOnlineOnly());
		
		// Price & Tax fields
		productDTO.setEcotax(product.getEcotax());
		productDTO.setPrice(product.getPrice() != null ? product.getPrice().doubleValue() : 0.0);
		productDTO.setWholesalePrice(product.getWholesalePrice());
		
		// Quantity fields
		productDTO.setQuantity(product.getQuantity());
		productDTO.setMinimalQuantity(product.getMinimalQuantity());
		productDTO.setAllowMultipleQuantity(product.getAllowMultipleQuantity());
		productDTO.setMaxQuantity(product.getMaxQuantity());
		
		// Calculation & Method fields
		productDTO.setPriceCalculationMethod(product.getPriceCalculationMethod());
		productDTO.setUnitPriceRatio(product.getUnitPriceRatio());
		productDTO.setAdditionalShippingCost(product.getAdditionalShippingCost());
		productDTO.setUnity(product.getUnity());
		
		// Reference fields
		productDTO.setReference(product.getReference());
		productDTO.setSupplierReference(product.getSupplierReference());
		productDTO.setLocation(product.getLocation());
		
		// Dimension fields
		productDTO.setWidth(product.getWidth());
		productDTO.setHeight(product.getHeight());
		productDTO.setDepth(product.getDepth());
		productDTO.setWeigth(product.getWeight()); // Note: Entity has weight, DTO has weigth (typo)
		
		// Stock & Availability fields
		productDTO.setOutOfStock(product.getOutOfStock());
		productDTO.setQuantityDiscount(product.getQuantityDiscount());
		productDTO.setAdvancedStockManagement(product.getAdvancedStockManagement());
		productDTO.setPackStockType(product.getPackStockType());
		
		// Customization fields
		productDTO.setCustomizable(product.getCustomizable());
		productDTO.setUploadableFiles(product.getUploadableFiles());
		productDTO.setTextFields(product.getTextFields());
		
		// Display & Visibility fields
		productDTO.setActive(product.getActive());
		productDTO.setShowAtFront(product.getShowAtFront());
		productDTO.setShowPrice(product.getShowPrice());
		productDTO.setIndexed(product.getIndexed());
		productDTO.setVisibility(product.getVisibility());
		
		// Redirect fields
		productDTO.setRedirectType(product.getRedirectType());
		productDTO.setIdProductRedirected(product.getIdProductRedirected());
		
		// Order & Cart fields
		productDTO.setAvailableForOrder(product.getAvailableForOrder());
		productDTO.setAutoAddToCart(product.getAutoAddToCart());
		productDTO.setAvailableDate(product.getAvailableDate());
		
		// Price Display & Selling fields
		productDTO.setPriceAdditionType(product.getPriceAdditionType());
		productDTO.setPriceDisplayMethod(product.getPriceDisplayMethod());
		productDTO.setSellingPreferenceType(product.getSellingPreferenceType());
		
		// Product Type fields
		productDTO.setCondition(product.getCondition());
		productDTO.setIsVirtual(product.getIsVirtual());
		productDTO.setBookingProduct(product.getBookingProduct());
		productDTO.setCacheIsPack(product.getCacheIsPack());
		productDTO.setCacheHasAttachments(product.getCacheHasAttachments());
		productDTO.setCacheDefaultAttribute(product.getCacheDefaultAttribute());
		
		// Date fields
		productDTO.setDateAdd(product.getDateAdd());
		productDTO.setDateUpd(product.getDateUpd());
		
		return productDTO;
	}
	
	public static Product toProduct(ProductDTO productDTO) {
		if (productDTO == null) {
			return null;
		}
		
		return Product.builder()
			.idProduct(productDTO.getIdProduct())
			.idSupplier(productDTO.getIdSupplier())
			.idManufacturer(productDTO.getIdManufacture())
			.idCategoryDefault(productDTO.getIdCategoryDefault())
			.idShopDefault(productDTO.getIdShopDefault())
			.idTaxRulesGroup(productDTO.getIdTaxRulesGroup())
			.onSale(productDTO.getOnSale())
			.onlineOnly(productDTO.getOnlineOnly())
			.ecotax(productDTO.getEcotax())
			.quantity(productDTO.getQuantity())
			.minimalQuantity(productDTO.getMinimalQuantity())
			.allowMultipleQuantity(productDTO.getAllowMultipleQuantity())
			.maxQuantity(productDTO.getMaxQuantity())
			.priceCalculationMethod(productDTO.getPriceCalculationMethod())
			.price(productDTO.getPrice() != null ? productDTO.getPrice().intValue() : 0)
			.wholesalePrice(productDTO.getWholesalePrice())
			.unity(productDTO.getUnity())
			.unitPriceRatio(productDTO.getUnitPriceRatio())
			.additionalShippingCost(productDTO.getAdditionalShippingCost())
			.reference(productDTO.getReference())
			.supplierReference(productDTO.getSupplierReference())
			.location(productDTO.getLocation())
			.width(productDTO.getWidth())
			.height(productDTO.getHeight())
			.depth(productDTO.getDepth())
			.weight(productDTO.getWeigth())
			.outOfStock(productDTO.getOutOfStock())
			.quantityDiscount(productDTO.getQuantityDiscount())
			.customizable(productDTO.getCustomizable())
			.uploadableFiles(productDTO.getUploadableFiles())
			.textFields(productDTO.getTextFields())
			.active(productDTO.getActive())
			.redirectType(productDTO.getRedirectType())
			.idProductRedirected(productDTO.getIdProductRedirected())
			.availableForOrder(productDTO.getAvailableForOrder())
			.autoAddToCart(productDTO.getAutoAddToCart())
			.priceAdditionType(productDTO.getPriceAdditionType())
			.showAtFront(productDTO.getShowAtFront())
			.sellingPreferenceType(productDTO.getSellingPreferenceType())
			.priceDisplayMethod(productDTO.getPriceDisplayMethod())
			.availableDate(productDTO.getAvailableDate())
			.condition(productDTO.getCondition())
			.showPrice(productDTO.getShowPrice())
			.indexed(productDTO.getIndexed())
			.visibility(productDTO.getVisibility())
			.cacheIsPack(productDTO.getCacheIsPack())
			.cacheHasAttachments(productDTO.getCacheHasAttachments())
			.isVirtual(productDTO.getIsVirtual())
			.bookingProduct(productDTO.getBookingProduct())
			.cacheDefaultAttribute(productDTO.getCacheDefaultAttribute())
			.dateAdd(productDTO.getDateAdd())
			.dateUpd(productDTO.getDateUpd())
			.advancedStockManagement(productDTO.getAdvancedStockManagement())
			.packStockType(productDTO.getPackStockType())
			.build();
	}
}