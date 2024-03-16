package com.hoteladvisor.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hoteladvisor.review.entity.Review;
import com.hoteladvisor.review.entity.ReviewId;

@Repository
public interface ReviewRepository extends JpaRepository<Review, ReviewId> {

}
