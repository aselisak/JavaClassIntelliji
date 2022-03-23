package com.syntax.class15;

public class ClassTask2 {

	public static void main(String[] args) {
		//Create a String and if the String is not empty perform the following: 
		// if the String has an odd number of characters and has 3 or more characters,
		//print the character in the middle of the String.

		String name = "Hello";//h-0, e-1, l-2, l-3, o-4
		
		System.out.println(name.length());
		if (name.length()%2!=0 && name.length()>=3){
			System.out.println(name.charAt(name.length()/2));
		}
		
		
		
		
		
	}

}
