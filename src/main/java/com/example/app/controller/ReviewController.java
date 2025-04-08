package com.example.app.controller;

import com.example.app.model.Review;
import com.example.app.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping("/add")
    public Review addReview(@RequestBody Review review) {
        return reviewService.addReview(review);
    }

    @GetMapping("/")
    public List<Review> getReviewsByProduct(@RequestParam Long productId) {
        return reviewService.getReviewsByProduct(productId);
    }
}
