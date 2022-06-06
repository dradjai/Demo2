package com.cognizant.shapes;

public class Triangle {
	int sides;
	static final double sideTriangle = 0.433;

	
	
	public double calculateArea(int sides) {
		double areaT = sideTriangle * sides * sides;
		return areaT;
		
	}
	
	

}
