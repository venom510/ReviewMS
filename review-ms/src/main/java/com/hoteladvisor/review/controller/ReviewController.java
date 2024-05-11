package com.hoteladvisor.review.controller;

import java.time.Instant;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hoteladvisor.review.entity.Rating;
import com.hoteladvisor.review.entity.Review;
import com.hoteladvisor.review.entity.ReviewId;
import com.hoteladvisor.review.repository.ReviewRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/review")
@RequiredArgsConstructor
public class ReviewController {
	private final ReviewRepository repo;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Review> fetchAll() {
		return repo.findAll();
	}
	
	@PostMapping
	public Review addReview(@RequestParam(name = "hotelId", required = true) String hotelId, 
			@RequestParam(name = "userId", required = true) String userId, 
			@RequestParam(name = "rating", required = true) int rating,
			@RequestParam(name = "comment", required = false) String comment) {
		return  repo.save(
				Review.builder()
				.reviewId(ReviewId.of(hotelId, userId))
				.rating(Rating.getRating(rating))
				.comment(comment)
				.timestamp(Instant.now())
				.build()
				);
	}
}
