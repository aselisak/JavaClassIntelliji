package com.syntax.class05;

import java.util.Scanner;

public class PossibleIssue {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		
		System.out.println("Capturing value using next");
		
		
		String value=scan.next();
		
		System.out.println(value);
		
		
		System.out.println("Capturing value using next");
		
		String anotherValue=scan.nextLine();
		
		System.out.println(anotherValue);
		
		
		System.out.println("End of program");
		
		
	}

}
