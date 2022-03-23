package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// create an array on int values using a scanner and calculate 
		// the sum of all stored elements in that array
		
		// Pseudo programming
		//1) Take the size of the Array using scanner class from user
		//2) Create an int array of above size
		//3) fill the array with elements from the user using scanner class
		//4) sum all the element of the array
		
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please eneter the size of the array");
		
		int size = input.nextInt();
		
		System.out.println("Size of the Array "+size);
		
		System.out.println();
		
		int [] array = new int [size];
		
		System.out.println("Please enter "+size+ " elements");
		
		System.out.println();
		
		for (int i=0; i<size; i++) {
		System.out.println("Please enter the element for index "+i);
			array[i]=input.nextInt();
		}
		
		
		System.out.println(Arrays.toString(array));
		
	    int sum=0;
	    
	    for (int x=0; x<array.length; x++) {
	    	sum+=array[x];
	    }
		System.out.println("Sum of Array elements of size "+sum);
		
		input.close();
		
	}

}
