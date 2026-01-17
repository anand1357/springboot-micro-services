package com.ms.product_service.controller;

import com.ms.product_service.entity.Product;
import com.ms.product_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    // Create a project
    @PostMapping("/save")
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    // Get All products
    @GetMapping("/getall")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Get product by ID
    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable Long productId) {
        Product product = productRepository.findById(productId)
                .orElseThrow(()->new RuntimeException("Product not found ID: "+ productId));
        return ResponseEntity.ok(product);
    }

}
