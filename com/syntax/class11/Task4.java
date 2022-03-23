package com.syntax.class11;

public class Task4 {

	public static void main(String[] args) {
		
		// if we need to update in arra we cannot use for enhanced loop
		// Create a 2D array of int type where you will store odd and even number.
		// Develop a program which will calculate the sum of odd and even numbers only.
		
		
		/* 
		 * Create the 2D array
		 * Store Even and Odd numbers in the 2D array
		 * Access the elements 
		 * Check the if element is even if it is add it to sumEven Variable
		 * Check the if element is Odd if it is add to oddEven Variabale
		 * Print the values of both variables
		 */
		
		int [][] array2D = {
				{2, 3, 4},
				{5, 6},
				{12, 6, 8}
		};
		
		int sumEven=0;
		int sumOdd=0;
		
		for (int i=0; i<array2D.length; i++) {
			
			for ( int x=0; x<array2D[i].length; x++) {
				int element=array2D[i][x];
				if (element%2==0){
					sumEven+=element;
				}else {
					sumOdd+=element;
				}
			}
		}
		
		System.out.println("The sum of even numbers "+sumEven);
		System.out.println("The sum of Odd numbers "+sumOdd);
		
		for (int [] row: array2D) {
			for (int element:row) {
				if (element%2==0){
					sumEven+=element;
				}else {
					sumOdd+=element;
				
			}
		}
		
		}
	
	System.out.println("The sum of even numbers "+sumEven);
	System.out.println("The sum of Odd numbers "+sumOdd);
	}
}
