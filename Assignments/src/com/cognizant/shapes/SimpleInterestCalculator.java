package com.cognizant.shapes;

public class SimpleInterestCalculator {
	double principalAmount;
	int numberOfYears;
	
	
	
	public SimpleInterestCalculator() {
	}



	public SimpleInterestCalculator(double principalAmount, int numberOfYears) {
		this.principalAmount = principalAmount;
		this.numberOfYears = numberOfYears;
	}



	void calculateSimpleInterest(double principalAmount, int numberOfYears) {
		this.principalAmount = principalAmount;
		this.numberOfYears= numberOfYears;
		
		if (this.principalAmount > 100000) {
			
			if (this.numberOfYears > 10) {
				double simpleInterest = this.principalAmount * this.numberOfYears * 10/100;
				System.out.println("The interest amount for a principal of " + this.principalAmount + 
						" and years " + this.numberOfYears + " is " + simpleInterest);
			}
			
			else {
				double simpleInterest = this.principalAmount * this.numberOfYears * 9.5/100;
				System.out.println("The interest amount for a principal of " + this.principalAmount + 
						" and years " + this.numberOfYears + " is " + simpleInterest);
			}
			
		}
		
		else {
			
			if (this.numberOfYears > 10) {
				double simpleInterest = this.principalAmount * this.numberOfYears * 5/100;
				System.out.println("The interest amount for a principal of " + this.principalAmount + 
						" and years " + this.numberOfYears + " is " + simpleInterest);
			}
			
			else {
				double simpleInterest = this.principalAmount * this.numberOfYears * 4.5/100;
				System.out.println("The interest amount for a principal of " + this.principalAmount + 
						" and years " + this.numberOfYears + " is " + simpleInterest);
			}
			
		}
	
	}

	

	public static void main(String[] args) {
		SimpleInterestCalculator c1 = new SimpleInterestCalculator();
		c1.calculateSimpleInterest(50000, 5);
		
	}

}
