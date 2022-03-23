package com.syntax.class08;

public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("What time is it?");
		
		for (int i=0; i<=12; i++) {
			for (int a=0; a<=59; a++) {
				for (int b=0; b<=59; b++) {
					System.out.println(i+"hours "+a+" minutes "+b+" minutes");
				}
			}
		}
		
		
		
	}

}
