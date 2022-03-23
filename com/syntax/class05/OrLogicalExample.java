package com.syntax.class05;

import java.util.Scanner;

public class OrLogicalExample {

	public static void main(String[] args) {
		// True|| True --> True
		// True || False --> True
		// False || True--> True
		// False || False---> false
		
		String day="Saturday";
		
		if (day.equals("Saturday") && day.equals("Sunday")) {
			System.out.println("I have a java class");
		}
		
		System.out.println("Code outside of if statement");
		
		
		/* lets ask user what is today day
		 * 
		 * based on the day lets define which class we have
		 * 
		 * if (monday or friday) --> there is no class today
		 * else if (tuesday or wednesday) -- > manuel
		 * else if (thusday or sunday) --> java class
		 */
		
		Scanner scan= new Scanner(System.in);
				
		day=scan.nextLine();
		
		if (day.equalsIgnoreCase("Monday") || day.equals("Friday")){
			
			System.out.println("There is no class");
		}else if(day.equalsIgnoreCase("Tuesday") || day.equals("Wednsday")) {
			System.out.println("There is a manuel testing class");
		}else if (day.equalsIgnoreCase("Thursday")) {
			System.out.println("Review class");
		}else if (day.equalsIgnoreCase("Saturday") || day.equals("Sunday")) {
			System.out.println("Java class");
		}else {
			System.out.println("Invalid input");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
