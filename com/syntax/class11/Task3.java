package com.syntax.class11;

public class Task3 {

	public static void main(String[] args) {
		// Create a 2D array of int type where you will store odd and even number.
		// Develop a program which will identify/print the even numbers only.
		
		/*
		 * Create the 2D array
		 * Store Even and Odd numbers in the 2D array
		 * Access the elements
		 * Print the elements if the are even
		 */
		
		
		int [][] array2D = {
				{2, 3, 4},
				{5, 6},
				{12, 6, 8}
		};
		
		for (int i=0; i<array2D.length; i++) {
			
			for (int x=0; x<array2D[i].length; x++) {
				int element= array2D[i][x];
				if (element%2==0) {
					System.out.println(element);
				}
			}
		}

	}

}
