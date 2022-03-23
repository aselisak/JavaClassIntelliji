package com.syntax.class07;

public class TaskWhileLoop {

	public static void main(String[] args) {
		

		//System.out.println("Print only even numbers from 1 to 30");
		
		int a=2;
		while (a<=30) {
		System.out.print(a+" ");
		    a+=2;
		 }
		
		System.out.println("There is another way to print from 1 to 30 ");
		
		int b=1;
		while(b<=30) {
			if (b%2==0) {
			System.out.print(b);
			
		}
		    b++;
			
			
		}
	}
    }
