package com.application.DemoApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Product {

    private int prodId;
    private String prodName;
    private int price;

    public Product(int prodId, String prodName, int price) {
        this.prodName = prodName;
        this.price = price;
        this.prodId = prodId;
    }
}
