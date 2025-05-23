package com.example.app.service;

import com.example.app.model.Order;
import com.example.app.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getOrdersByBuyer(String buyerUsername) {
        return orderRepository.findByBuyerUsername(buyerUsername);
    }
}
