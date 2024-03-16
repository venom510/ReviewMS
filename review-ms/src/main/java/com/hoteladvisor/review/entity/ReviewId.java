package com.hoteladvisor.review.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class ReviewId {
	private String hotelId;
	private String userId;
}
