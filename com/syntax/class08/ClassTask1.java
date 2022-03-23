package com.syntax.class08;

public class ClassTask1 {

	public static void main(String[] args) {
		/*
		 * I want to find out the sum of all even 
		 * and all odd numbers from the range 1 to 50
		 */
         System.out.println("Calculating even numbers");
         
         int sumEven=0;
         int sumOdd=0;
         for (int i=1; i<=50; i++) {
        	 
        	 if(i%2==0) {
        	 sumEven=sumEven+i;
         }else {
        	 sumOdd=sumOdd+i;
         }
         }
         System.out.println("sum of even numbers "+sumEven+" sum of odd numbers "+sumOdd);
         
         System.out.println("Another way to find sum of even or odd");
         
         int sum =0;
         for (int i=2; i<=50; i+=2) {
        	 sum+=i;
         }
         System.out.println(sum);
         
         int sum1=0;
         for (int i=1; i<=50; i +=2) {
        	 sum1+=i;
         }
         System.out.println(sum1);
	}

}
