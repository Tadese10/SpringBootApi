package com.example.api2.Controller;

import com.example.api2.ExceptionsHandler.ProductNotFoundException;
import com.example.api2.Models.Product;
import com.example.api2.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products/{id}/amount")
    public BigDecimal getProductAmount(@PathVariable long id) {
        // Retrieve product by ID from the repository
        Product product = productRepository.findById(id);
        if (product == null) {
            throw new ProductNotFoundException("Product not found with id: " + id);
        }
        // Return the amount of the product
        return product.getAmount();
    }
}