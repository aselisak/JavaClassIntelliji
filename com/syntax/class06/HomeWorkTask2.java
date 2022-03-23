package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkTask2 {

	public static void main(String[] args) {
		// Using scanner class create calculator. 
		//Allow user to enter 2 numbers and operator(+,-,*,/).
		//Based on operator provide the result to user.

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1=scan.nextInt();
		System.out.println("Please enter the operator");
		String oper=scan.next();
		
		System.out.println("Enter second number");
		int num2=scan.nextInt();
		
		
		
		
		if (oper.equals("+")) {
			System.out.println(num1+num2);	
		}else if (oper.equals("-")) {
			System.out.println(num1-num2);
		}else if (oper.equals("*")) {
			System.out.println(num1*num2);
		}else if (oper.equals("/")) {
			System.out.println(num1/num2);
		}else {
			System.out.println("Invalid entry");
		}
		
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
