package com.cognizant.shapes;

public class ShapesSwitch {
	
		int numberOfSides;
		int sideLengthT;
		
		
		public void calculateShapeArea(int numberOfSides, int sideLengthT) {
			this.numberOfSides = numberOfSides;
			this.sideLengthT = sideLengthT;
			
			switch (numberOfSides) {
			
			case 1:
				Circle c = new Circle();
				System.out.println("The area of the circle is " + c.calculateArea(sideLengthT));
				break;
			
			case 3:
				Triangle t = new Triangle();
				System.out.println("The area of the triangle is " + t.calculateArea(sideLengthT));
				break;
				
			case 4: 
				Square sq = new Square(sideLengthT);
				System.out.println("The area of the square is " + sq.calculateArea(sideLengthT));
				break;
			
			default:
				System.out.println("No Shapes Present");

			}
		}
			
		public static void main(String[] args) {
			ShapesSwitch s1 = new ShapesSwitch();
			s1.calculateShapeArea(5, 15);
			
			
		}

}
