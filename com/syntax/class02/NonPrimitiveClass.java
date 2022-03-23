package com.syntax.class02;

public class NonPrimitiveClass {

	public static void main(String[] args) {
	
	String name="Asel";// creating a variable-->string value  
	String lastName="Kiyatova";//any value that you put in double quote

	long phoneNumber=123456789l;
	String mobileNumber="347-261-6603";
	int num1=1234;
	
	String greeting="Hello friends!";
	System.out.println(greeting);
	//syso+contr+space-->autocomplete print statement
	System.out.println(name);
	System.out.println(lastName);
	
	System.out.println(name+" "+lastName);//+ sign in order to combine 2 strings
	
	/*using + sign we can concatenate 
	 * String +String
	 * String +int
	 * String +boolean
	 * String +doeble, char etc...
	 
	 */
	
	int age=37;
	//Asel is a 25 years old
 System.out.println(name+" is "+age +" years old");
	
	String address="1615 E 10th street";
	//I live on 1615 E 10th street
	System.out.println("I Live on "+address);
	String feeling="like";
	String food="kebab";
	System.out.println("I "+feeling+" "+food);
	feeling="love";
	food="shrimp";
	System.out.println("I "+feeling+" "+food);
	
	//String - is a class that can represent combination of multiple characters 
	//enclosed in ""
	//When we have a String value and we want to attach any other 
	//type of value to it we use  + address=> plays role as
	//a cocatenation operator
	//Operators in Java
	//= assignment operator
	//arithmetical 
	
	
	
	
	
	
	
	}

}
