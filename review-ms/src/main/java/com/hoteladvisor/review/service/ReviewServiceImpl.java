package com.hoteladvisor.review.service;

import com.hoteladvisor.review.entity.Rating;
import com.hoteladvisor.review.entity.Review;
import com.hoteladvisor.review.entity.ReviewId;
import com.hoteladvisor.review.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public final class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository;

    @Override
    public Review addReview(String hotelId, String userId, int rating, String comment) {
        return reviewRepository.save(
                Review.builder()
                        .reviewId(ReviewId.of(hotelId, userId))
                        .rating(Rating.getRating(rating))
                        .comment(comment)
                        .build()
        );
    }

    @Override
    public List<Review> findAll() {
        return reviewRepository.findAll();
    }
}
