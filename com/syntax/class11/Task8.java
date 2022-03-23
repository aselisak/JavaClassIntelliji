package com.syntax.class11;

public class Task8 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array
		
		
		
		
		int [] arr= {10, 20, 90, 50, 70};
		
		int largest=arr[0];
		
		int smallest=arr[0];
		
		for (int elements:arr) {
			if(elements>largest) {
				largest=elements;
			}
			
			if (elements<smallest) {
				smallest=elements;
			}
		}
		
		
		System.out.println("The largest number is "+largest);
		System.out.println("The smallest number is "+smallest);
	}

}
