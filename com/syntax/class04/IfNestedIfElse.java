package com.syntax.class04;

public class IfNestedIfElse {

	public static void main(String[] args) {
		
		boolean diploma=true;
		if (diploma) {
			System.out.println("Congratulations");
			
		double gpa=3.1;
		
		if (gpa<=3.5) {
		        	System.out.println("You should studied harder");
			
		}else {
			        System.out.println("You are eligible for scholarship");
		}
		
		}else {
			        System.out.println("PLease get a degree");
		}
		
		
		/* --------------------------------------------------------*/
	
		
		
		
		double mortgageRate=2.5;
		int mortgagePrice=45000;
		
		
		if (mortgageRate>4.5) {
			System.out.println("I cannot buy the house");

		}else {
			System.out.println("I will buy the house");
		if (mortgagePrice>50000) {
			System.out.println("You should take a loan");
		}else {
			System.out.println("you can pay cash");
		}

	

		}
	}
}
