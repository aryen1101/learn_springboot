package com.application.DemoApplication.service;

import com.application.DemoApplication.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(101, "IPhone", 50000), new Product(102, "Samsung", 20000), new Product(103, "Xiaomi", 20000));

    public List<Product> getProducts() {
        return products;

    }
}
