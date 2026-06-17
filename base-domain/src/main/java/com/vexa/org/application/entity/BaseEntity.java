package com.vexa.org.application.entity;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseEntity {
	@Autowired
	protected DataSource dataSource;
    protected Long id;
	public BaseEntity(Long id) {
		this.id = id;
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
