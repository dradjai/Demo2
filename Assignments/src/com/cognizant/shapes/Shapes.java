package com.cognizant.shapes;

public class Shapes {
	int numberOfSides;
	int sideLengthT;
	
	
	public void calculateShapeArea(int numberOfSides, int sideLengthT) {
		this.numberOfSides = numberOfSides;
		this.sideLengthT = sideLengthT;
		if (numberOfSides == 4) {
			Square sq = new Square(sideLengthT);
			System.out.println("The area of the square is " + sq.calculateArea(sideLengthT));
				
		}
		else if (numberOfSides == 1) {
			Circle c = new Circle();
			System.out.println("The area of the circle is " + c.calculateArea(sideLengthT));
		
		}
		
		else if (numberOfSides == 3) {
			Triangle t = new Triangle();
			System.out.println("The area of the triangle is " + t.calculateArea(sideLengthT));
		}
		else {
			System.out.println("No Shapes Present");
		}
		
	}
	public static void main(String[] args) {
		Shapes s1 = new Shapes();
		s1.calculateShapeArea(4, 5);
		
		
	}
}

