package com.cognizant.shapes;

public class Square {
	int sideLength;
	
	Square(int sideLength) {
		this.sideLength = sideLength;
	}
	
	
	public int calculateArea(int sideLength) {
		int area = sideLength * sideLength;
		return area;
	}
	
	

}
