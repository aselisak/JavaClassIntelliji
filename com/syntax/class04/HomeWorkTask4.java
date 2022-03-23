package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkTask4 {

	public static void main(String[] args) {
		// Create a Java program that will ask if user has a credit card or not.
		//If you user does not have a credit card then offer them. 
		//If they do have one ask what is balance on the card? 
		//If balance of the card is larger than 1000, tell them to pay off immediately, 
		//otherwise you can tell them that they can spend more.

	    Scanner card=new Scanner(System.in);	
	    
		System.out.println("Do you have a credit card?");
		
		String type=card.nextLine();
		
		if (type.equals("no")) {
			
			System.out.println("We can offer you");
			
		}else if(type.equals("yes")) {
			System.out.println("What is your balance?");
		}
		int balance=card.nextInt();
		if (balance>1000) {
			System.out.println("Pay off immediately");
		}else {
			System.out.println("You can spend more");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
	}


