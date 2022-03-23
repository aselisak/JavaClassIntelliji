package com.syntax.class03;

public class JavaShortHandOperators {

	public static void main(String[] args) {
		// +, -,*, /,%
		
		int num=100;
		num=num+100;
		System.out.println(num);
        num+=100; //this is exact means --> this num=num+100
		
		System.out.println(num);
		num-=20;
		System.out.println(num);//280
		
		num/=10;
		System.out.println(num);
		
		num%=2;
		System.out.println(num);
		
	}

}
