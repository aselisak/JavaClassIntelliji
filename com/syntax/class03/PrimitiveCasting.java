package com.syntax.class03;

public class PrimitiveCasting {

	
	public static void main(String[] args) {
		
		int i=10;
		// widening or implicit
		//we store int value 10 inside double variable
		double d=10;
		System.out.println(i);
		System.out.println(d);
		// main+cnt+space-->autocomplete
		
		// int num=10.0; //Type mismatch: cannot convert from double to int
		// narrowing or explicit casting
		// we store double value 10.99 into int variable
		int num=(int)10.99;
		System.out.println(num);
		
		float f=10.99f;//by default java read decimal number as a double
		
		byte b=(byte)1000;
		System.out.println(b);
		
		long number=(int)111555511l;
		System.out.println(number);
		int num1=(int)11154555511l;
		System.out.println(num1);
		

	}

}
