package com.syntax.class03;

public class MoreIfStatements {

	public static void main(String[] args) {
	/*define a variable to store a value of day
	 * 
	 * if day is Saturday --> I am having java class today
	 * otherwise --> I dont know which class I have
	 */
    String day="Monday";
    if (day.equals("Saturday")) {
    	System.out.println("I am having java class today");
        System.out.println("I am very excited"); 
        System.out.println("I am going to have fun with my classmates");
    
    }else {
    	System.out.println("I dont know which class I have");
    	System.out.println("Maybe today is funday");
    }
		
	}

}
