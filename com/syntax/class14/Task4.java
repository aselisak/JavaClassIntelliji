package com.syntax.class14;

public class Task4 {
	
	String createEmail(String name, String lastName, String email) {
		return name+lastName+"@"+email+".com";
	}

	public static void main(String[] args) {
	  
		Task4 object = new Task4();
		System.out.println(object.createEmail("asel", "kiyatova", "gmail"));

	}

}
