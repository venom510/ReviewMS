package com.hoteladvisor.review.entity;

public enum Rating {
	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5);
	
	private int value;
	private Rating(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	@Override
	public String toString() {
		StringBuilder ans=new StringBuilder();
		for(int i=0;i<this.value;i++) {
			ans.append("*");
		}
		return ans.toString();
	}
	
}
