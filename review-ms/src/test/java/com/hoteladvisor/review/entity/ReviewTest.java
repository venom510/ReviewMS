package com.hoteladvisor.review.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class ReviewTest {
    @Test
    void testReviewedOnInitialization() {
        Review review = Review.builder().build();
        assertNotNull(review.getReviewedOn());
    }
}