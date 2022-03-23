package com.syntax.class15;

public class ClassTask3 {

	public static void main(String[] args) {
	//Create a String and print it in reverse order (Sunday → yadnuS).
		
		String name = "Sunday";
		String reverseString="";
		
	
		
		for ( int i=name.length()-1; i>=0; i--) {
			reverseString=reverseString+name.charAt(i);
			
		}
		System.out.println(reverseString);
		
		
		
		

	}

}
