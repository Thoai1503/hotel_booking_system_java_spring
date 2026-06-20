package com.vexa.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vexa.org.application.entity.Product;





public interface ProductJpaRepository extends JpaRepository<Product, Long>  {
         
}
