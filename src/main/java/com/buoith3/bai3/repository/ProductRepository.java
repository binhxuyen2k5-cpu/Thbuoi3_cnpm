package com.buoith3.bai3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buoith3.bai3.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}