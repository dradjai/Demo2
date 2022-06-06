package com.cogent.scanassignment;

import java.util.Scanner;

public class ScannerLaptopDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int option;
		
		do {
			System.out.println("Enter Option:");
			System.out.println("Add-1");
			System.out.println("Subtract-2");
			System.out.println("Multiply-3");
			System.out.println("Quit-4");
			
			option = sc.nextInt();
			
			
			switch(option) {
			
			case 1: 
				System.out.println("Enter 2 numbers to be added");
				int addnum1 = sc.nextInt();
				int addnum2 = sc.nextInt();
				int addResult = addnum1 + addnum2;
				System.out.println("The result is " + addResult);
				System.out.println("");
				break;
			
			
			case 2:
				System.out.println("Enter 2 numbers to be subtracted");
				int subnum1 = sc.nextInt();
				int subnum2 = sc.nextInt();
				int subResult = subnum1 - subnum2;
				System.out.println("The result is " + subResult);
				System.out.println("");
				break;
				
			
			case 3:
				System.out.println("Enter 2 numbers to be multiplied");
				int multnum1 = sc.nextInt();
				int multnum2 = sc.nextInt();
				int multResult = multnum1 * multnum2;
				System.out.println("The result is " + multResult);
				System.out.println("");
				break;
			}
			
		} while (option != 4);
		System.out.println("Terminated...");
	}


}


