package com.syntax.class12;

public class Horse {//define the objects/also called instantiating class
	
	String name;
	String breed;
	int age;
	double weight;
	
	void run() {
		System.out.println(name+" is running");
	}
	
	void eat() {
		System.out.println(name+" is eating");
	}
	
	void printCompleteInfo() {
		System.out.println("name = "+name);
		System.out.println("breed = "+breed);
		System.out.println("age = "+age);
		System.out.println("weight = "+weight);



	}
	
	
	
	public static void main(String[] args) {//we will call them
		// TODO Auto-generated method stub
		
		Horse besh=new Horse();//instantiating or creating the object/instances
		besh.name="spirit";//accessing the property on object and setting its value 
		besh.breed="stallion";
		besh.age=20;
		besh.weight=400;
		besh.run();

		besh.printCompleteInfo();
		
		System.out.println("*********************");//printing all the info related to an object
		Horse mrAsHorse=new Horse();
		mrAsHorse.name="Tuzik";
		mrAsHorse.breed="Mustang";
		mrAsHorse.age=15;
		mrAsHorse.weight=450;
		mrAsHorse.run();
		mrAsHorse.printCompleteInfo();

	}

}
