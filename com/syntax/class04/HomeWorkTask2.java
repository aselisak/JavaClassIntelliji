package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkTask2 {

	public static void main(String[] args) {
		  // You are DMV representative and you need to ask customer their age. 
         //If they are 18 and older you will issue a driver license to them,
		//otherwise you will offer them to get a learners permit.
		
		
		Scanner age=new Scanner(System.in);
		System.out.println("What is your age");
		int license=age.nextInt();
		if (license>=18) {
			System.out.println("I will issue the driver license");
		}else {
			System.out.println("I will offer you a learner permit");
		}
		
		
		
		
		
		
		

	}

}
