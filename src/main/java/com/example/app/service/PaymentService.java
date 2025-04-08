package com.example.app.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public String processPayment(String productId, String buyerUsername) {
        // Here you would integrate with Fastspring API to process the payment
        // For now, we will return a mock response
        return "Payment processed for product ID: " + productId + " by user: " + buyerUsername;
    }
}
