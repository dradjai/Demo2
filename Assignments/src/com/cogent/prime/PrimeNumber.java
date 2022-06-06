package com.cogent.prime;

public class PrimeNumber {

	public static void main(String[] args) {
	
		
		for (int j = 2; j < 150; j++) {	
			
			boolean prime = true;
			
			int i = 2;
			while(i <= j/2) {
				if (j % i == 0) {
					prime = false;
					break;
				}
				i++;
			}
			if (prime == true) {
				System.out.print(j + ",");
			}
			
		}
	}
	
}
	

	