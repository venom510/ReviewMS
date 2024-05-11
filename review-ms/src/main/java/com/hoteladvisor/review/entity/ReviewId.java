package com.hoteladvisor.review.entity;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Slf4j
public class ReviewId {
	private String hotelId;
	private String userId;
	
	public static ReviewId of(String hotelId, String userId) {
		if (hotelId == null || userId == null || hotelId.isBlank() || userId.isBlank()) {
			log.error("Ids can't be null!");
			throw new IllegalArgumentException("Ids can't be null!");
		}
		return new ReviewId(hotelId, userId);
	}
}
