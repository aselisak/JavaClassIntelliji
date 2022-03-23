package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkTask1 {

public static void main(String[] args) {
	
		// You are a loan specialist and you need to ask user what 
		//is the amount of loan is needed. If loan is less or equal to 200,000
		//then you would lend the money otherwise you would reject the client.

	Scanner loan=new Scanner(System.in);
	System.out.println("What amount of money do you need?");
	
	int amount=loan.nextInt();
	if (amount<=200000) {
		System.out.println("I will give you the money");
	}else {
		System.out.println("I will not");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	 }
	
	}
		
	



