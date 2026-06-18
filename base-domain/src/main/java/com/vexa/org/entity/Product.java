package com.vexa.org.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class Product extends BaseEntity {

    public Product(Long id,DataSource dataSource) {
    	
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
	private Long idProduct;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public boolean isBookingProduct() {
		return isBookingProduct;
	}

	public void setBookingProduct(boolean isBookingProduct) {
		this.isBookingProduct = isBookingProduct;
	}
	private  Long idCategory;
    private Double price;
    private boolean isBookingProduct;
    
    public boolean isConnected() throws SQLException {
   return 	this.dataSource.getConnection().isValid(2);
    }
     
    
    	
    
}
