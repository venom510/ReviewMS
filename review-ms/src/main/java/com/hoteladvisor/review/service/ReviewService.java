package com.hoteladvisor.review.service;

import com.hoteladvisor.review.entity.Review;

import java.util.List;

public interface ReviewService {
    Review addReview(String hotelId, String userId, int rating, String comment);

    List<Review> findAll();
}
