package com.syntax.class07;

public class DoLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("------While check condition before execution-----");
		int num=10;
		
		while (num<=3) {
			System.out.println("Hello");//5 times
			num++;
		}
		
		System.out.println("----------Do While check condition after execution-----------");
		int num1=10;
		
		do {// is less used than while
			System.out.println("Hello");
			num1++;
		}while(num1<=3);
		
		
	}

}
