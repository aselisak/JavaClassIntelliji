package com.syntax.class12;

public class Dog1 {
	    
	String name;
    String color;
    String breed;
    char gender;
    int age;
    double weight;
	
	void printCompleteInfo() {

		System.out.println("this type of dogs "+breed+" likes to play");

	

		System.out.println("This type of breed "+breed+" likes to eat a lot");

    

		System.out.println("This typo of dogs "+breed+" likes cold weather");
	}
	    
	
	public static void main(String[] args) {
		// Create a Dog Class and create 3 different objects of it: 
		//Husky, Bulldog, Labrador  with specific  attributes and behaviors.

		Dog1 Husky=new Dog1();
		Husky.name="Loo";
		Husky.breed="Husky";
		Husky.gender='m';
		Husky.age=10;
		Husky.weight=50;
		
		Husky.printCompleteInfo();
		System.out.println("************************");
		Dog1 Bulldog =new Dog1();
		
		Bulldog.name="Ace";
		Bulldog.breed="Bulldog";
		Bulldog.gender='f';
		Bulldog.age=11;
		Bulldog.weight=45;
		
		Bulldog.printCompleteInfo();
		System.out.println("*************************");
		
		Dog1 Labrador=new Dog1();
		
		Labrador.name="Patrick";
		Labrador.breed="Labrador";
		Labrador.gender='m';
		Labrador.age=8;
		Labrador.weight=60;
		
		Labrador.printCompleteInfo();
		
		
	}

}
