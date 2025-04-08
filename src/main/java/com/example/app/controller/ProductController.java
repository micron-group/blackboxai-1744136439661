package com.example.app.controller;

import com.example.app.model.Product;
import com.example.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/")
    
    @PostMapping("/purchase")
    public String purchaseProduct(@RequestParam Long productId, @RequestParam String buyerUsername) {
        // Process payment
        return paymentService.processPayment(productId.toString(), buyerUsername);
    }
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
