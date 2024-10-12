package com.hoteladvisor.review.entity;

import java.time.Instant;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public final class Review {
	@EmbeddedId
	private ReviewId reviewId;
	private String comment;
	private Rating rating;
	private Instant reviewedOn;

	public static ReviewBuilder builder() {
		return new CustomBuilder();
	}

	private static final class CustomBuilder extends ReviewBuilder {
		private void initializeTimestamp() {
			super.reviewedOn = Instant.now();
		}

		@Override
		public Review build() {
			initializeTimestamp();
			return super.build();
		}
	}
}
