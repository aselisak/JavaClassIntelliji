package com.syntax.class04;

public class IfNestedIF {

	public static void main(String[] args) {
		// Nested IF - If inside if
		//if (boolean condition){ outer if
		//code A; onl;y when condition is true
		//If (boolean condition){
		//code B;} nested if
		//Example

		boolean vaccine=true;
		int dose=2;
		
		if(vaccine) {
			System.out.println("How many doses you have?");
			if (dose==1) {
				System.out.println("You need another shot");
			}else {
				System.out.println("You are fully vaccinated");
			}
		}
		
		//*--------------------------------------------------------*
		
		/* declare a variable for allergy
		 *    if you have a pollen
		 *    if you have a peanut
		 *    if you have a wheat 
		 * if no allergy --> you are lucky
		 */
		
		
		boolean allergy=false;
		if (allergy) {
			System.out.println("Let's check what allergies you have");
			
		    String allergy1="pollen";
		    
		if (allergy1.equals("pollen")) {
			System.out.println("Please stay at home when the trees are blooming. Take medications ");
		}else if (allergy1.equals("peanut")) {
			System.out.println("Please do not eat food contains nuts. Take med B");
		}else if (allergy1.equals("glute")) {
			System.out.println("Please follow glute free diet. Take med C");
		
		
		}else {
			System.out.println("I don't know which suggestion to give you");
		}
		}else {
			System.out.println("you are lucky");
		}
		
		
		
		
		
	}

}
