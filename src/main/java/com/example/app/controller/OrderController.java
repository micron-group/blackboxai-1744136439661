package com.example.app.controller;

import com.example.app.model.Order;
import com.example.app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @GetMapping("/history")
    public List<Order> getOrderHistory(@RequestParam String buyerUsername) {
        return orderService.getOrdersByBuyer(buyerUsername);
    }
}
