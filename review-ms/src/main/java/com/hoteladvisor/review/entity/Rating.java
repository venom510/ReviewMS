package com.hoteladvisor.review.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@AllArgsConstructor
@Slf4j
public enum Rating {
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5);

    private final int value;

    public static Rating getRating(int value) {
        return switch (value) {
            case 1 -> ONE;
            case 2 -> TWO;
            case 3 -> THREE;
            case 4 -> FOUR;
            case 5 -> FIVE;
            default -> {
                log.error("Value provided for rating is: {}. Rating value needs to be between 1 and 5!!", value);
                throw new IllegalArgumentException("Given value for rating : " + value + " needs to be an integer between 1 and 5!");
            }
        };
    }
}
