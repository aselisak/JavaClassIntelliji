package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkTask5 {

	public static void main(String[] args) {
		//Write a program to ask user to enter numbers of worked years and annual salary.
		//If user worked for more or equals to 5 years than user is eligible for the bonus, 
		//otherwise he is not. 
		//Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.

		Scanner number=new Scanner(System.in);
		
		System.out.println("How many years you have worked?");
		
		int years=number.nextInt();
		
		if (years>=5) {
			System.out.println("The user is eligible");
			
		}else {
			
			System.out.println("Not eligible");		
		}
		int salary=number.nextInt();
		
		if (salary>5000) {
			
			System.out.println("The bonus is 5000");
			
		}else {
			System.out.println("The bonus is 3000");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
