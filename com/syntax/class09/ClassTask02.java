package com.syntax.class09;

public class ClassTask02 {

	public static void main(String[] args) {
		// Create an array of names and store all names of your group. 
		// Then print your name from that array. (use 2 different ways of creating an array).
		
		String[] names=new String[7];
		
		names[0]="Svetlana";
		names[1]="Aga";
		names[2]="Andrew";
		names[3]="Azizullah";
		names[4]="Mohammad";
		names[5]="Asel";
		names[6]="Khadija";
		
		System.out.println(names[5]);
		
		System.out.println("------------2 way---------");
		
		String[] names1={"Svetlana", "Aga", "Andrew", "Azizullah", "Mohammad", "Asel", "Khafija"};
		
		System.out.println(names1[5]);
		
		
		
		
		
		
	}

}
