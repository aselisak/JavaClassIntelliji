package com.syntax.classreview;

public class Human {

	String name, lastName, eyeColor, hairColor;
	int age;
	char gender;
	
	void sleep() {
		System.out.println("All humans sleep");
	}
	void eat() {
		System.out.println("All humans eat");
	}
	void run() {
		System.out.println("All humans run");
	}
	

	
	
	public static void main(String[] args) {
		
		Human obj = new Human();
		obj.name="John";
		obj.lastName="Doe";
		obj.eyeColor="Blue";
		obj.gender='M';
		obj.age=33;
		obj.hairColor="Grey";
		
		obj.sleep();
		obj.eat();
		obj.run();
		
		
	
	}

}
