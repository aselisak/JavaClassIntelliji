package com.syntax.class12;

import java.util.Scanner;

public class CalculatorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator simpleMathCalculator =new Calculator();
		
		
		simpleMathCalculator.add();
		
		simpleMathCalculator.addNumbers(10,25);
		
		simpleMathCalculator.addNumbers(30,30);
		
		int num=50;
		int num1=50;
		simpleMathCalculator.addNumbers(num,num1);
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		scanner.close();
	}

}
