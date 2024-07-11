package com.javaex.ex06;

public class Circle {
	
	
	private int radius;
	
	
	public Circle(int radius) {
		this.radius = radius;

	}
	

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String toString() {
		return "반지름: " + radius;
	}

}
