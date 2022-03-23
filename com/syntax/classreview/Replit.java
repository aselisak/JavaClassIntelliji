package com.syntax.classreview;

import java.util.Scanner;

public class Replit {

	public static void main(String[] args) {
		// Task the user to enter any number

        //if a user enters a number and it is even, print "Value is even",
		//otherwise print "Value is odd" and prints Odd value is just right

       //If the number is even then check if it is greater than 1000 or not.

      //If the number is greater than 1000, then print "Even value is large", else print "Even value is just right".
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your number");
		
		int num=scan.nextInt();
		
		if (num%2==0) {
			System.out.println("Value is even");
			if (num>1000) {
				System.out.println("Even value is large");
			}else {
				System.out.println("Even value is just right");
			}
			
		}else {
			System.out.println("Value is odd");
			System.out.println("Value is just right");
		}
		
		
		scan.close();
		
		
		
		
	}

}
