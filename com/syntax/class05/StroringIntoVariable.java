package com.syntax.class05;

import java.util.Scanner;

public class StroringIntoVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.out.println("Quiz, Mid term, and final");
		
		Scanner input=new Scanner(System.in);
		
		int score=input.nextInt();
		char grade;
		
		if (score>=90) {
			grade='A';
		}else if (score>=70 && score<90) {
			grade='B';
		}else if (score>=50 && score<70) {
			grade='C';
		}else  {
			grade='F';
		}
		
		System.out.println("You grade is "+grade);
		
		//If your grade is A or B --> you are a good student
		// otherwise --> you should study
		
		if (grade=='A' || grade=='B') {
			System.out.println("You are a great student");
		}
		
		
		
		
		
	}

}
