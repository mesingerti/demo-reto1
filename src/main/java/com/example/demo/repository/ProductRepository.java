package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Product;

public interface  ProductRepository extends JpaRepository<Product, Long> {
    
    List<Product> findByNameContaining(String name);
 
}
