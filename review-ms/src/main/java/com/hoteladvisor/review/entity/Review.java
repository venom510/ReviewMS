package com.hoteladvisor.review.entity;

import java.time.Instant;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Review {
	@EmbeddedId
	private ReviewId reviewId;
	private String comment;
	private Rating rating;
	private Instant timestamp;
}
