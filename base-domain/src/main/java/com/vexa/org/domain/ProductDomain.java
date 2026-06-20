package com.vexa.org.domain;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.sql.DataSource;

import com.vexa.org.application.entity.BaseEntity;

import jakarta.persistence.Column;


public class ProductDomain extends BaseDomain	 {


    
    public ProductDomain(Long id,DataSource dataSource) {
    	
		super(id,dataSource);
	
		String className = this.getClass().getName();
		String[] parts = className.split("\\.");
		 className = parts[parts.length - 1];
		String[] tblName =className.split(".");
		System.out.println("Table: "+ className);
		String tableFormat = this.toSnakeCase(className);
		String tableName = toSnakeCase(getClass().getSimpleName());

		String sql = new StringBuilder()
		        .append("SELECT * FROM qlo_")
		        .append(tableName)
		        .append(" WHERE id_")
		        .append(tableName)
		        .append(" = ?")
		        .toString();

		System.out.println(sql);
		
		// TODO Auto-generated constructor stub
	    try(Connection connection= dataSource.getConnection();
	    		PreparedStatement ps = connection.prepareStatement(sql);
	    		){
	    	  ps.setLong(1, id);
	            ResultSet rs = ps.executeQuery();
	            
	            if (rs.next()) {
	              this.id = rs.getLong("id_product");
	              this.idCategory = rs.getLong("id_category_default");
	              this.price =rs.getDouble("price");
	              
	            }
	    	
	    } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	public Long getIdProduct() {
		return idProduct;
	}





	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}





	public Long getIdCategory() {
		return idCategory;
	}





	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}





	public Long getIdSupplier() {
		return idSupplier;
	}





	public void setIdSupplier(Long idSupplier) {
		this.idSupplier = idSupplier;
	}





	public Long getIdManufacture() {
		return idManufacture;
	}





	public void setIdManufacture(Long idManufacture) {
		this.idManufacture = idManufacture;
	}





	public Long getIdCategoryDefault() {
		return idCategoryDefault;
	}





	public void setIdCategoryDefault(Long idCategoryDefault) {
		this.idCategoryDefault = idCategoryDefault;
	}





	public Long getIdShopDefault() {
		return idShopDefault;
	}





	public void setIdShopDefault(Long idShopDefault) {
		this.idShopDefault = idShopDefault;
	}





	public Long getIdTaxRulesGroup() {
		return idTaxRulesGroup;
	}





	public void setIdTaxRulesGroup(Long idTaxRulesGroup) {
		this.idTaxRulesGroup = idTaxRulesGroup;
	}





	public Long getOnSale() {
		return onSale;
	}





	public void setOnSale(Long onSale) {
		this.onSale = onSale;
	}





	public Long getOnlineOnly() {
		return onlineOnly;
	}





	public void setOnlineOnly(Long onlineOnly) {
		this.onlineOnly = onlineOnly;
	}





	public BigDecimal getEcotax() {
		return ecotax;
	}





	public void setEcotax(BigDecimal ecotax) {
		this.ecotax = ecotax;
	}





	public Integer getQuantity() {
		return quantity;
	}





	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}





	public Integer getMinimalQuantity() {
		return minimalQuantity;
	}





	public void setMinimalQuantity(Integer minimalQuantity) {
		this.minimalQuantity = minimalQuantity;
	}





	public Integer getAllowMultipleQuantity() {
		return allowMultipleQuantity;
	}





	public void setAllowMultipleQuantity(Integer allowMultipleQuantity) {
		this.allowMultipleQuantity = allowMultipleQuantity;
	}





	public Integer getMaxQuantity() {
		return maxQuantity;
	}





	public void setMaxQuantity(Integer maxQuantity) {
		this.maxQuantity = maxQuantity;
	}





	public Integer getPriceCalculationMethod() {
		return priceCalculationMethod;
	}





	public void setPriceCalculationMethod(Integer priceCalculationMethod) {
		this.priceCalculationMethod = priceCalculationMethod;
	}





	public Double getPrice() {
		return price;
	}





	public void setPrice(Double price) {
		this.price = price;
	}





	public Integer getWholesalePrice() {
		return wholesalePrice;
	}





	public void setWholesalePrice(Integer wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}





	public Integer getUnity() {
		return unity;
	}





	public void setUnity(Integer unity) {
		this.unity = unity;
	}





	public Integer getUnitPriceRatio() {
		return unitPriceRatio;
	}





	public void setUnitPriceRatio(Integer unitPriceRatio) {
		this.unitPriceRatio = unitPriceRatio;
	}





	public Integer getAdditionalShippingCost() {
		return additionalShippingCost;
	}





	public void setAdditionalShippingCost(Integer additionalShippingCost) {
		this.additionalShippingCost = additionalShippingCost;
	}





	public String getReference() {
		return reference;
	}





	public void setReference(String reference) {
		this.reference = reference;
	}





	public String getSupplierReference() {
		return supplierReference;
	}





	public void setSupplierReference(String supplierReference) {
		this.supplierReference = supplierReference;
	}





	public String getLocation() {
		return location;
	}





	public void setLocation(String location) {
		this.location = location;
	}





	public BigDecimal getWidth() {
		return width;
	}





	public void setWidth(BigDecimal width) {
		this.width = width;
	}





	public BigDecimal getHeight() {
		return height;
	}





	public void setHeight(BigDecimal height) {
		this.height = height;
	}





	public BigDecimal getDepth() {
		return depth;
	}





	public void setDepth(BigDecimal depth) {
		this.depth = depth;
	}





	public BigDecimal getWeigth() {
		return weigth;
	}





	public void setWeigth(BigDecimal weigth) {
		this.weigth = weigth;
	}





	public Integer getOutOfStock() {
		return outOfStock;
	}





	public void setOutOfStock(Integer outOfStock) {
		this.outOfStock = outOfStock;
	}





	public Integer getQuantityDiscount() {
		return quantityDiscount;
	}





	public void setQuantityDiscount(Integer quantityDiscount) {
		this.quantityDiscount = quantityDiscount;
	}





	public Integer getCustomizable() {
		return customizable;
	}





	public void setCustomizable(Integer customizable) {
		this.customizable = customizable;
	}





	public Integer getUploadableFiles() {
		return uploadableFiles;
	}





	public void setUploadableFiles(Integer uploadableFiles) {
		this.uploadableFiles = uploadableFiles;
	}





	public Integer getTextFields() {
		return textFields;
	}





	public void setTextFields(Integer textFields) {
		this.textFields = textFields;
	}





	public Integer getActive() {
		return active;
	}





	public void setActive(Integer active) {
		this.active = active;
	}





	public String getRedirectType() {
		return redirectType;
	}





	public void setRedirectType(String redirectType) {
		this.redirectType = redirectType;
	}





	public Integer getIdProductRedirected() {
		return idProductRedirected;
	}





	public void setIdProductRedirected(Integer idProductRedirected) {
		this.idProductRedirected = idProductRedirected;
	}





	public Integer getAvailableForOrder() {
		return availableForOrder;
	}





	public void setAvailableForOrder(Integer availableForOrder) {
		this.availableForOrder = availableForOrder;
	}





	public Integer getAutoAddToCart() {
		return autoAddToCart;
	}





	public void setAutoAddToCart(Integer autoAddToCart) {
		this.autoAddToCart = autoAddToCart;
	}





	public Integer getPriceAdditionType() {
		return priceAdditionType;
	}





	public void setPriceAdditionType(Integer priceAdditionType) {
		this.priceAdditionType = priceAdditionType;
	}





	public Integer getShowAtFront() {
		return showAtFront;
	}





	public void setShowAtFront(Integer showAtFront) {
		this.showAtFront = showAtFront;
	}





	public Integer getSellingPreferenceType() {
		return sellingPreferenceType;
	}





	public void setSellingPreferenceType(Integer sellingPreferenceType) {
		this.sellingPreferenceType = sellingPreferenceType;
	}





	public Integer getPriceDisplayMethod() {
		return priceDisplayMethod;
	}





	public void setPriceDisplayMethod(Integer priceDisplayMethod) {
		this.priceDisplayMethod = priceDisplayMethod;
	}





	public LocalDate getAvailableDate() {
		return availableDate;
	}





	public void setAvailableDate(LocalDate availableDate) {
		this.availableDate = availableDate;
	}





	public String getCondition() {
		return condition;
	}





	public void setCondition(String condition) {
		this.condition = condition;
	}





	public Integer getShowPrice() {
		return showPrice;
	}





	public void setShowPrice(Integer showPrice) {
		this.showPrice = showPrice;
	}





	public Integer getIndexed() {
		return indexed;
	}





	public void setIndexed(Integer indexed) {
		this.indexed = indexed;
	}





	public String getVisibility() {
		return visibility;
	}





	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}





	public Integer getCacheIsPack() {
		return cacheIsPack;
	}





	public void setCacheIsPack(Integer cacheIsPack) {
		this.cacheIsPack = cacheIsPack;
	}





	public Integer getCacheHasAttachments() {
		return cacheHasAttachments;
	}





	public void setCacheHasAttachments(Integer cacheHasAttachments) {
		this.cacheHasAttachments = cacheHasAttachments;
	}





	public Integer getIsVirtual() {
		return isVirtual;
	}





	public void setIsVirtual(Integer isVirtual) {
		this.isVirtual = isVirtual;
	}





	public Integer getBookingProduct() {
		return bookingProduct;
	}





	public void setBookingProduct(Integer bookingProduct) {
		this.bookingProduct = bookingProduct;
	}





	public Integer getCacheDefaultAttribute() {
		return cacheDefaultAttribute;
	}





	public void setCacheDefaultAttribute(Integer cacheDefaultAttribute) {
		this.cacheDefaultAttribute = cacheDefaultAttribute;
	}





	public LocalDate getDateAdd() {
		return dateAdd;
	}





	public void setDateAdd(LocalDate dateAdd) {
		this.dateAdd = dateAdd;
	}





	public LocalDate getDateUpd() {
		return dateUpd;
	}





	public void setDateUpd(LocalDate dateUpd) {
		this.dateUpd = dateUpd;
	}





	public Integer getAdvancedStockManagement() {
		return advancedStockManagement;
	}





	public void setAdvancedStockManagement(Integer advancedStockManagement) {
		this.advancedStockManagement = advancedStockManagement;
	}





	public Integer getPackStockType() {
		return packStockType;
	}





	public void setPackStockType(Integer packStockType) {
		this.packStockType = packStockType;
	}





	public void setBookingProduct(boolean isBookingProduct) {
		this.isBookingProduct = isBookingProduct;
	}
	private Long idProduct;
    private  Long idCategory;
   
    private boolean isBookingProduct;
    private Long idSupplier;
    
    private Long idManufacture;
    
    private Long idCategoryDefault;
    

    private Long idShopDefault;
    
    

    private Long idTaxRulesGroup;
 
    private Long onSale;
    
  
    private Long onlineOnly;
    
    
   
    private BigDecimal ecotax = BigDecimal.ZERO;
   
   
    private Integer quantity =Integer.valueOf(0);
   
    
    private Integer minimalQuantity =Integer.valueOf(0);
    
    
    private Integer allowMultipleQuantity = 1;
    
  
    private Integer maxQuantity = 1;
    
 
    private Integer priceCalculationMethod =1;
    
   
    private Double price = 0.0;
    
   
    private Integer wholesalePrice= Integer.valueOf(0);
    

    private Integer unity;
    

    private Integer unitPriceRatio = Integer.valueOf(0);
    
   
    private Integer additionalShippingCost = Integer.valueOf(0);
    
    private String reference;

    private String supplierReference;
    
    private String location;
    
    
    private BigDecimal width = BigDecimal.ZERO;
    
  
    private BigDecimal height = BigDecimal.ZERO;
    
    
    private BigDecimal depth = BigDecimal.ZERO;
    
  
    private BigDecimal weigth = BigDecimal.ZERO;
        
    
    private Integer outOfStock = 2;
    
    
    private Integer quantityDiscount = 0;
    
    
    
    private Integer customizable = 0;
    
   
    private Integer uploadableFiles = 0;
    
   
    private Integer textFields = 0;
    
   
    private Integer active = 0;

    private String redirectType = "404";
    
 
    private Integer idProductRedirected= 0;
    
   
    private Integer availableForOrder = 1;
    
    
    private Integer autoAddToCart = 0;

    
    private Integer priceAdditionType = 1;
    
   
    private Integer showAtFront = 1;
    
  
    private Integer sellingPreferenceType = 1;

    
    private Integer priceDisplayMethod = 1;
    
   
    private LocalDate availableDate = LocalDate.of(1970, 1, 1);
    
  
    private String condition ="new";
    
    
    private Integer showPrice = 0;
    
    
    private Integer indexed = 0;
    
    
    private String visibility ="both";
    
    
    private Integer cacheIsPack =0;
    
   
    private Integer cacheHasAttachments =0;
    
   
    private Integer isVirtual =0;
    
 
    private Integer bookingProduct = 1;
    

    private Integer cacheDefaultAttribute ;
    
  
    private LocalDate dateAdd;
    
    private LocalDate dateUpd;
    

    private Integer advancedStockManagement = 0;
    

    private Integer packStockType = 3;
    
    
    
    	
    
    public boolean isBookingProduct() {
    	return isBookingProduct;
    }
}
