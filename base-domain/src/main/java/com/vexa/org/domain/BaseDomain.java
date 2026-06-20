package com.vexa.org.domain;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseDomain {

    protected Long id;
	public BaseDomain(Long id,DataSource dataSource) {
		this.id = id;
		
	}

	
	public static String toSnakeCase(String str) {
	    return str.replaceAll("([a-z])([A-Z])", "$1_$2")
	              .toLowerCase();
	}
	
}
