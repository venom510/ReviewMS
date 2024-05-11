package com.hoteladvisor.review.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hoteladvisor.review.entity.Review;
import com.hoteladvisor.review.entity.ReviewId;

@Repository
public interface ReviewRepository extends JpaRepository<Review, ReviewId> {
	List<Review> findByReviewId_HotelId(String hotelId);
	
	List<Review> findByReviewId_UserId(String userId);
}
