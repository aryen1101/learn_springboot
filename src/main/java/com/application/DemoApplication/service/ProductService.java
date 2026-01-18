package com.application.DemoApplication.service;

import com.application.DemoApplication.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "IPhone", 50000), new Product(102, "Samsung", 20000), new Product(103, "Xiaomi", 20000)));

    public List<Product> getProducts() {
        return products;

    }

    public Product getProductById(int prodId) {
        return products.stream().filter(p -> p.getProdId() == prodId).findFirst().orElse(new Product(100, "No Item Found", 0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {

            if (products.get(i).getProdId() == product.getProdId()) {
                index = i;
            }
            ;
        }
        products.set(index, product);

    }

    public void deleteProduct(int prodId) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {

            if (products.get(i).getProdId() == prodId) {
                index = i;
            }


        }
        products.remove(index);
    }
}

