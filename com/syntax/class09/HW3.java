package com.syntax.class09;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers= {15, 45, 10, 32};
		
		int size=numbers.length;
		int sum=0;
		
		for (int i=0; i<size; i++) {
			sum+=numbers[i];
		}
		System.out.println("Sum of all elements in the Array = "+sum);
		
		sum=0;
		
		for(int num:numbers) {
			sum+=num;
			
		}
		System.out.println("Sum of all elements in the Array = "+sum);
		
	}

}
