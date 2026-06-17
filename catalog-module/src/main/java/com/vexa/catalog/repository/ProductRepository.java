package com.vexa.catalog.repository;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    @Autowired
    private DataSource dataSource;
    
    private boolean isConnected() throws SQLException {
    	   return 	this.dataSource.getConnection().isValid(2);
    	    }
    	   public boolean testConnect() {
    		   try {
				return this.isConnected();
			   } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			   }
    	   }  
}
