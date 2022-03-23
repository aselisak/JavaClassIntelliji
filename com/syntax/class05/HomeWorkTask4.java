package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkTask4 {

	public static void main(String[] args) {
		//Write a program that will ask user to input inputs the current time (use 24 hour format).
		//Based on the given time define:
	    //if hour is between 1-11 --> Morning
		//if hour between 12-15 --> Afternoon
		//if hour between 16-20 --> Evening
		//if hour between 21-24 --> Night

		
		System.out.println("What is the current time?");
		
		Scanner input=new Scanner(System.in);
		
		int time=input.nextInt();
		
		if (time>1 && time<11) {
			System.out.println("Morning");
		}else if (time>11 && time<16) {
			System.out.println("Afternoon");
		}else if (time>16 && time<21) {
			System.out.println("Evening");
		}else if (time>21 && time<25) {
			System.out.println("Night");
		}
		
		
		
	}

}
