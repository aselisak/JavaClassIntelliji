package com.syntax.class12;

public class Phone {

	String name;
	String model;
	String OS;
	int battery;
	String color;
	int sizeOfMemory;

	void run() {
		System.out.println("The operating system " + OS);
	}

	void life() {
		System.out.println("The batter life " + battery);
	}

	void memory() {
		System.out.println("The memory of OS of" + sizeOfMemory);
	}

	void rings() {
		System.out.println("The sound of the phone " + name);
	}

	void printCompleteInfo() {

		System.out.println("Name of phone " + name);
		System.out.println("Model of the phone " + model);
		System.out.println("Color of the phone " + color);
		System.out.println("Batery life of the phone " + battery);
		System.out.println("Operating System of the phone " + OS);
		System.out.println("Size of memory of the phone " + sizeOfMemory);

	}

	public static void main(String[] args) {

		Phone Iphone = new Phone();

		Iphone.name = "Iphone";
		Iphone.model = "Pro Max 12";
		Iphone.OS = "IOS";
		Iphone.battery = 12;
		Iphone.color = "Pacific Blue";
		Iphone.sizeOfMemory = 256;
		Iphone.printCompleteInfo();
		System.out.println("*****************");
		Phone Samsung = new Phone();
		Samsung.name = "Samsung";
		Samsung.model = "Galaxy Note";
		Samsung.OS = "Android";
		Samsung.battery = 12;
		Samsung.color = "White";
		Samsung.sizeOfMemory = 254;

		Samsung.printCompleteInfo();
		System.out.println("****************");
		Phone Nokia = new Phone();
		Nokia.name = "Nokia";
		Nokia.OS = "Unknown";
		Nokia.color = "Black";
		Nokia.sizeOfMemory = 10;
		Nokia.battery = 8;

		Nokia.printCompleteInfo();

	}

}
