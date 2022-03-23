package com.syntax.class05;

import java.util.Scanner;

public class HomeWorktask3 {

	public static void main(String[] args) {
		//TAsk user to enter a number and then define if number is small, medium or large
		//Small number is value between 1 and 10
		//Medium number is value between 11 and 100
		//Large number is value between 101 and 1000

		System.out.println("Define the number is small, medium or large");
		
		Scanner num=new Scanner(System.in);
		
		int sum=num.nextInt();
		
		if (sum>1 && sum<10) {
			System.out.println("small");
		}else if (sum>10 && sum<100) {
			System.out.println("medium");
		}else if (sum>100 && sum<1000) {
			System.out.println("large");
		}
		
		
	}

}
