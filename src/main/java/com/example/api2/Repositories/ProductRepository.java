package com.example.api2.Repositories;

import com.example.api2.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Method to find a product by ID
    Product findById(long id);
}