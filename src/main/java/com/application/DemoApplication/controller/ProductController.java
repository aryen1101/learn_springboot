package com.application.DemoApplication.controller;

import com.application.DemoApplication.model.Product;
import com.application.DemoApplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);

    }


    @PostMapping
    public void addProduct(@RequestBody Product product) {
        service.addProduct(product);
    }

    @PutMapping
    public void updateProduct(@RequestBody Product product) {
        service.updateProduct(product);

    }

    @DeleteMapping("/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);



    }
}
