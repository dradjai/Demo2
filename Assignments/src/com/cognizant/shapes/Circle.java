package com.cognizant.shapes;

public class Circle {
	int radius;
	static final double pi = 3.14;
	
	public double calculateArea(int radius) {
		this.radius = radius;
		double area = pi * (radius * radius);
		return area;
		
	}

}
