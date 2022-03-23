package com.syntax.classreview;

import java.util.Arrays;

public class TwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] array = new int[2][3];
		//1 row
		array [0][0]=10;
		array [0][1]=20;
		array [0][2]=30;
		//2row
		array [1][0]=1;
		array [1][1]=2;
		array [1][2]=3;
		System.out.println(array.length);//2
		
		int [][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(numbers.length);
		// how to get all elements from 2D Arrays
	
		for (int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(" get all elements from 2D array using for each loop");
		
		
		for (int [] elements:numbers) {
		    for (int num:elements) {
		    	System.out.print(num+" ");
		    }
		    System.out.println();
		}
		
		int [] arr= {10,67,3,9};
		
		Arrays.sort(arr);
		System.out.println(arr);
		
		System.out.println(arr[arr.length-1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
