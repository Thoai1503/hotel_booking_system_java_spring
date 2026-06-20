package com.vexa.catalog.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;

@Entity
@Builder

public class Product {
    @Id
	private Long idProduct;
    
    private Long idSupplier;
    
    private Long idManufacture;
    
    private Long idCategoryDefault;
    
    @Column(nullable = false)
    private Long idShopDefault;
    
    
    @Column(nullable = false)
    private Long idTaxRulesGroup;
    
    @Column(nullable = false)
    private Long onSale;
    
    @Column(nullable = false)
    private Long onlineOnly;
    
    
    @Builder.Default
    @Column(nullable = false)
    private BigDecimal ecotax = BigDecimal.ZERO;
   
    @Builder.Default
    @Column(nullable = false)
    private Integer quantity =Integer.valueOf(0);
   
    @Builder.Default
    @Column(nullable = false)
    private Integer minimalQuantity =Integer.valueOf(0);
    
    @Builder.Default
    @Column(nullable = false)
    private Integer allowMultipleQuantity = 1;
    
    @Builder.Default
    @Column(nullable = false)
    private Integer maxQuantity = 1;
    
    @Builder.Default
    @Column(nullable = false)
    private Integer priceCalculationMethod =1;
    
    @Builder.Default
    @Column(nullable = false)
    private Integer price = Integer.valueOf(0);
    
    @Builder.Default
    @Column(nullable = false)
    private Integer wholesalePrice= Integer.valueOf(0);
    

    private Integer unity;
    
    @Builder.Default
    @Column(nullable = false)
    private Integer unitPriceRatio = Integer.valueOf(0);
    
    @Builder.Default
    @Column(nullable = false)
    private Integer additionalShippingCost = Integer.valueOf(0);
    
    private String reference;

    private String supplierReference;
    
    private String location;
    
    @Builder.Default
    @Column(nullable = false)
    private BigDecimal width = BigDecimal.ZERO;
    
    @Builder.Default
    @Column(nullable = false)
    private BigDecimal height = BigDecimal.ZERO;
    
    @Builder.Default
    @Column(nullable = false)
    private BigDecimal depth = BigDecimal.ZERO;
    
    @Builder.Default
    @Column(nullable = false)
    private BigDecimal weigth = BigDecimal.ZERO;
        
    @Builder.Default
    @Column(nullable = false)
    private Integer outOfStock = 2;
    
    @Builder.Default
    private Integer quantityDiscount = 0;
    
    @Builder.Default
    @Column(nullable = false)
    private Integer customizable = 0;
    
    @Builder.Default
    @Column(nullable = false)
    private Integer uploadableFiles = 0;
    
    @Builder.Default
    @Column(nullable = false)
    private Integer textFields = 0;
    
    @Builder.Default
    @Column(nullable = false)
    private Integer active = 0;

    @Builder.Default
    @Column(nullable = false)
    private String redirectType = "404";
    
    @Builder.Default
    @Column(nullable = false)
    private Integer idProductRedirected= 0;
    
    @Builder.Default
    @Column(nullable = false)
    private Integer availableForOrder = 1;
    
    @Builder.Default
    @Column(nullable = false)
    private Integer autoAddToCart = 0;

    @Builder.Default
    @Column(nullable = false)
    private Integer priceAdditionType = 1;
    
    @Builder.Default
    @Column(nullable = false)
    private Integer showAtFront = 1;
    
    @Builder.Default
    @Column(nullable = false)
    private Integer sellingPreferenceType = 1;

    @Builder.Default
    @Column(nullable = false)
    private Integer priceDisplayMethod = 1;
    
    @Builder.Default
    @Column(nullable = false)
    private LocalDate availableDate = LocalDate.of(1970, 1, 1);
    
    @Builder.Default
    @Column(nullable = false)
    private String condition ="new";
    
    @Builder.Default
    @Column(nullable = false)
    private Integer showPrice = 0;
    
    @Builder.Default
    @Column(nullable = false)
    private Integer indexed = 0;
    
    @Builder.Default
    @Column(nullable = false)
    private String visibility ="both";
    
    @Builder.Default
    @Column(nullable = false)
    private Integer cacheIsPack =0;
    
    @Builder.Default
    @Column(nullable = false)
    private Integer cacheHasAttachments =0;
    
    @Builder.Default
    @Column(nullable = false)
    private Integer isVirtual =0;
    
    @Builder.Default
    @Column(nullable = false)
    private Integer bookingProduct = 1;
    

    private Integer cacheDefaultAttribute ;
    
    @Column(nullable = false)
    private LocalDate dateAdd;
    
    @Column(nullable = false)
    private LocalDate dateUpd;
    
    @Builder.Default
    @Column(nullable = false)
    private Integer advancedStockManagement = 0;
    
    @Builder.Default
    @Column(nullable = false)
    private Integer packStockType = 3;
    
    
    
    
    
}
