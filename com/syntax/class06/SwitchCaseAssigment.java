package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseAssigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your country: ");
		
		String country=input.next();
		String language;
		
		switch (country.toLowerCase()) {
		
		case "usa":
			language="english";
			break;
		case "russia":
			language="russian";
			break;
		case "germany":
			language="rerman";
			break;
		case "china":
			language="chinese";
			break;
		default:
			language = "unknown";
			
		}
		input.close();
		System.out.println("In "+ country+" people speak "+language);
		
		
		
		
		
		
	}

}
