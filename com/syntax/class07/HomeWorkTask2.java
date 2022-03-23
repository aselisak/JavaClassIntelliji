package com.syntax.class07;

import java.util.Scanner;

public class HomeWorkTask2 {

	public static void main(String[] args) {
		/*
		 * Ask a user to enter name, last name and age 5 times. 
		 * Every time your program should print those values in a format 
		 * "You name is _ _ and you are _ years old"
		 */
		
		Scanner scan=new Scanner(System.in);
		
		for (int i=1; i<=5; i++) {
	    System.out.println("Enter your name");
		String name=scan.nextLine();
		
		
		System.out.println("Enter your last name");
		String lastName=scan.nextLine();
		
		
		System.out.println("Enter your age");
		int age=scan.nextInt();
	  
		scan.nextLine();
			System.out.println("You name is "+name+" "+lastName+" and you are "+age+" years old");
		}
		
		scan.close();
	}

	
	}


