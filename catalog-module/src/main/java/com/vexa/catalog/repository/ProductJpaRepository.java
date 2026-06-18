package com.vexa.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vexa.org.entity.Product;

public interface ProductJpaRepository extends JpaRepository<Product, Long>  {

}
