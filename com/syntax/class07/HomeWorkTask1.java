package com.syntax.class07;

import java.util.Scanner;

public class HomeWorkTask1 {

	public static void main(String[] args) {
		/* Declare a variable to store a price for a coffee. 
		 * Ask user to pay for a coffee.
		 * Keep asking to pay for coffee until user enters exact amount .
		 * If user give more than $3 --> ask them to give less,
		 * if user gives less money then ask to give more. 
		 * Once user got a write amount print “Please enjoy your candy”
		 */

		Scanner scan=new Scanner(System.in);
		
		double price=3;
		double priceCoffee;
		System.out.println("Pay for your coffee");
		
		do {
			
			priceCoffee=scan.nextDouble();
			if (priceCoffee<price) {
				System.out.println("Give more money");
				
			}else if (priceCoffee>price) {
				System.out.println("Give less money");
				
			}
		
		}while (price!=priceCoffee);
		System.out.println("Please enjoy your coffee");
		
		scan.close();
	}

}
