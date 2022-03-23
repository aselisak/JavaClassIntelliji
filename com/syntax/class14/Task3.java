package com.syntax.class14;

public class Task3 {
	
	
	String sayHello(String country) {
		switch(country) {
		case "USA":
			return "Hello";
	
		case "France":
		    return "Bonjour";
		 
		case "Turkey":
			return "Merhaba";
		 default:
			 return "Zulfiya is very good and patient student";
		}		
	}

	public static void main(String[] args) {
	 Task3 object = new Task3();
	 String country = object.sayHello("Silva");
		System.out.println(country);

	}

}
