package com.syntax.classreview;

public class Class14Review {

	public static void main(String[] args) {
		// Nested loops
		
		for (int i=1; i<=3; i++) {
			for (int j=1; j<3; j++) {
		
				System.out.print(i+" "+j);
	
			}
		}		System.out.println();
		System.out.println("---------Miltiplication table------");
		
		for (int a=1; a<=10; a++) {
			for (int b=1; b<=10; b++) {
				System.out.println(a+" X "+b+" = "+a*b);
			}
			System.out.println("--------------------");
		}

	}

}
