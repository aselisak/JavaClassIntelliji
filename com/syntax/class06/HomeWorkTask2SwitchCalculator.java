package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkTask2SwitchCalculator {

	public static void main(String[] args) {
		
	Scanner scan1=new Scanner(System.in);
	
	int num1;
	int num2;
	char oper;
	
	
	System.out.println("Please enter the first number");
	num1=scan1.nextInt();
	System.out.println("What is the second number");
	num2=scan1.nextInt();
	System.out.println("What is the operator");
		oper=scan1.next().charAt(0);
		
		int result=0;
		switch(oper) {
		case'+':
			result=num1+num2;
			break;
		case'-':
			result=num1-num2;
			break;
		case'*':
			result=num1*num2;
			break;
		case'/':
			result=num1/num2;
			break;
		default:
			System.out.println("Invalid entry");
		}
		
		
	      System.out.println(result);
	
	
	      scan1.close();
	
	
	
	
	
	
	
	
	}
}
