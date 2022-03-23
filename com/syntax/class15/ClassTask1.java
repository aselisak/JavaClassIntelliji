package com.syntax.class15;

public class ClassTask1 {

	public static void main(String[] args) {
		// Write a program that reads two people's first
		//names and if they expecting boy or girl? 
				//Based on the input suggests a name for a baby:
				//Example Output:
				//Mom’s first name? Mary
				//Dad’s first name? Daniel
				//Boy or Girl? boy
				//Suggested baby name: DANRY
				//Example Output:
				//Mom’s first name? Mary
				//Dad’s first name? Daniel
				//Boy or Girl? girl
               //Suggested baby name: MAIEL
		
		String nameMom = "Mariam";
		String nameDad = "Dan";
		String baby = "boy";
		String firstPart = "";
		String secondPart = "";
		
		if (baby.equalsIgnoreCase("boy")) {
			firstPart = nameDad.substring(0, nameDad.length()/2);
			secondPart = nameMom.substring(nameMom.length()/2);
		}else if (baby.equalsIgnoreCase("girl")){
	
			firstPart = nameMom.substring(0, nameMom.length()/2);
			secondPart = nameDad.substring(nameDad.length()/2);
		}		
		
		System.out.println(firstPart+secondPart);
	
		
		
		
		
	}

}
