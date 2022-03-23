package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {
		// for Loop--> most widely used in Java
		
		/* 
		 * initialization   (start point)
		 * condition (end point)	
		 * increment or decrement 
		 */
		
		
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");
		
		
		}
		System.out.println("I need to print number from 1 to 20");
		
		for(int i=1; i<=20; i++) {
			System.out.print(i+" ");
		}
		
	
		System.out.println("I need to print number from 10 to 25");
		
		for (int i=10; i<=25; i++) {
			System.out.print(i+" ");
		}
	
	    System.out.println("I need to print from 50 to 1");    	
		 
	    for (int i=50; i>=1; i--) {
	    	System.out.print(i+" ");
	    }
}
	

}
