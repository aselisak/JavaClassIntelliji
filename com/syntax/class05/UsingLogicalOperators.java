package com.syntax.class05;

public class UsingLogicalOperators {

	public static void main(String[] args) {
		// && logical operation for (AND)
		// Or ||
		// Or not !
		
		boolean likeJava=true;
		boolean understandJava=true;
		boolean practice=true;
		
		
		if (likeJava && practice && understandJava) {
			
			System.out.println("This is best combination");
		}
		
		System.out.println("End of code");
		
		// we want to compare 3 numbers and find the largest
		
		/*
		 * if num1 > num2 && num1>num3-->num1 is the largest
		 * else if num2>num1 && num2.num3--> num2 is the largest
		 * else if num3>num1 && num3>2--> num3 is the largest
		 */
		
		
		int num1=100;
		int num2=2000;
		int num3=300;
		
		
if (num1>num2 && num1>num3) {
			System.out.println(num1+" is the largest");
		}else if (num2>num1 && num2>num3){
			System.out.println(num2+" is the lasgest");
		}else if (num3>num1 && num3>num2) {
			System.out.println(num3+" is the largest");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
