package com.vexa.org.entity;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseEntity {

	protected final  DataSource dataSource;
    protected Long id;
	public BaseEntity(Long id, DataSource dataSource) {
		this.id = id;
		this.dataSource=dataSource;
	}
	public boolean isConnect() {
     try {
    	 
		return		this.dataSource.getConnection().isValid(2);
	 } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	 }
	}
	
	
	
}
