package com.syntax.class11;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		//1) Create a 2D array of int values. 
		//2) Print the sum of all numbers
		
		int [][] array2D= {
				{10, 10, 10},
				{20, 20, 20},
				{30, 30, 30}
		};
		
		
		
		int sum=0; 
		
		for (int i=0; i<array2D.length; i++) {
			System.out.println(Arrays.toString(array2D[i]));
			for (int x=0; x<array2D[i].length; x++) {
				sum+=array2D[i][x];
				
		}
		}
		
		
		
		
		System.out.println("The sum of all elements "+sum);
		
	}

}
