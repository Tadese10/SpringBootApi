package com.example.api2.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
public class Product {
    @Id
    private Long id;
    private String description;
    private BigDecimal amount;
    private Boolean active;
    private LocalDateTime creationDate;

    // Getters and setters
    public BigDecimal getAmount(){
        return  amount;
    }
}