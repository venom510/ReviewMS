package com.hoteladvisor.review.controller;

import com.hoteladvisor.review.entity.Review;
import com.hoteladvisor.review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/review")
@RequiredArgsConstructor
public final class ReviewController {
    private final ReviewService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Review> fetchAll() {
        return service.findAll();
    }

    @PostMapping
    public Review addReview(@RequestParam(name = "hotelId", required = true) String hotelId,
                            @RequestParam(name = "userId", required = true) String userId,
                            @RequestParam(name = "rating", required = true) int rating,
                            @RequestParam(name = "comment", required = false) String comment) {
        return service.addReview(hotelId, userId, rating, comment);
    }
}
