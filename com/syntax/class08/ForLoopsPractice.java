package com.syntax.class08;

public class ForLoopsPractice {

	public static void main(String[] args) {
	 	
		
		
		for (int i=1; i<=3; i++) {
			System.out.println("Hello "+i);
		}
		
		System.out.println("      Multiplication table");
		
		int num=7;
		int result;
		
		for (int i=1; i<=10; i++) {
			result=num*i;
			System.out.println(num+" X "+i+" = "+result);
		}
		
		System.out.println("----What is the output------");
		
		for( int i=0; i<=10; i+=3) {
			System.out.print(i+" ");
		}
		
		
		int sum=0;
		for (int i=1; i<=5; i++) {
			sum+=i;// sum=sum+i;
			System.out.println(sum);

		}
		
		System.out.println("---What is the output----");
		
		int value=1;
		
		for(int i=1; i<4; i++) {
			value*=i;
		}
		
		System.out.println(value);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
