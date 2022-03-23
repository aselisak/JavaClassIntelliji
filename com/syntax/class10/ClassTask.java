package com.syntax.class10;

public class ClassTask {

	public static void main(String[] args) {
		// create an array and retrieve all elements reverse order
		
		
		String[] names = {"Asel","Mira", "Asyl", "Kenan"};
		
		

		for(int i=0; i<names.length; i++) {
			
		System.out.println(names[i]);
		}
			
		System.out.println("-------------reverse order-----------");
		
		for (int i=names.length-1; i>=0; i--) {
			System.out.println(names[i]);
		}
		
		System.out.println("----------another way------------------");
		
		int [] arrs= {45,23,15,30};
		
		for(int i=0; i<arrs.length; i++) {
			System.out.print(arrs[arrs.length-i-1]+" ");
		}
		
		

	}

}
