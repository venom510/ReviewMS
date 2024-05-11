package com.hoteladvisor.review.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@AllArgsConstructor
@Slf4j
public enum Rating {
	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5);
	
	private int value;
	
	public static Rating getRating(int value) {
		switch (value) {
		case 1: return ONE;
		case 2: return TWO;
		case 3: return THREE;
		case 4: return FOUR;
		case 5: return FIVE;
		default:
			log.error("Value provided for rating is: {}. Rating value needs to be between 1 and 5!!", value);
			throw new IllegalArgumentException("Given value for rating : " + value + " needs to be an integer between 1 and 5!");
		}
	}
}
