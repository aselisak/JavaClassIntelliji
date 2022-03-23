package com.syntax.class05;

import java.util.Scanner;

public class HomeWorktask1 {

	public static void main(String[] args) {
		//Prompt the user to enter person heights in inches. 
		//Person should be classified as one of the following:
		//short (under 60 inch)
		//medium(between 60 -72 inch)
		//tall (over 72 inch)

		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter person height in inches");
		
		int height=input.nextInt();
		if (height<60) {
			System.out.println("short");
		}else if (height>60 && height<72) {
			System.out.println("medium");
		}else if (height>72) {
			System.out.println("tall");
		}
		
		
	}

}
