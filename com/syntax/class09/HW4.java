package com.syntax.class09;

public class HW4 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.
		
		
		int [] number = {15,45,10,32,};
		
		int largest=number[0];
		
		for(int i=1; i< number.length; i++) {
			if (number[i] > largest) {
				largest = number[i];
			}
			
		}
		
		System.out.println(largest);
		
	        largest=number[0];
		
		for(int num:number) {
			
			if (num >largest ) {
				
				largest=num;
				
			
			}	
			
		}
		
		System.out.println(largest);
		
	}

}
