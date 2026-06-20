package com.vexa.org.application.entity;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseEntity {

    protected Long id;
	public BaseEntity(Long id) {
		this.id = id;
	}

	
}
