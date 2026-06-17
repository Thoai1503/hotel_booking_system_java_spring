package com.vexa.org.entity;

import java.sql.SQLException;

import javax.sql.DataSource;

public class Product extends BaseEntity {

    public Product(Long id,DataSource dataSource) {
		super(id,dataSource);
		// TODO Auto-generated constructor stub
	}
	private Long idProduct;
    private  Long idCategory;
    private Double price;
    private boolean isBookingProduct;
    
    public boolean isConnected() throws SQLException {
   return 	this.dataSource.getConnection().isValid(2);
    }
     
    
    	
    
}
