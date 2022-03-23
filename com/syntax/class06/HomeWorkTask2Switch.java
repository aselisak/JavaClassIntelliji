package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkTask2Switch {

	public static void main(String[] args) {
		// Using scanner class create calculator. 
		//Allow user to enter 2 numbers and operator(+,-,*,/). 
		//Based on operator provide the result to user.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1=scan.nextInt();
		
		System.out.println("Enter the operator");
		String oper=scan.next();
		
		System.out.println("Enter second number");
		int num2=scan.nextInt();
		
		int result=0;
		 
		switch(oper) {
		case "+":
		  result=num1+num2;
		  break;
		case "-":
		  result=num1-num2;
		  break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;
		default:
			System.out.println("Invalid entry");
		}
		
		System.out.println(num1+oper+num2+"="+result);
		
		
		scan.close();
		
		
		
		
		
		
	}

}
