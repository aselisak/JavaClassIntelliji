package com.syntax.class04;

import java.util.Scanner;

public class HomeworkTask3 {

	public static void main(String[] args) {
		// Create a Java program that will ask user to input 
		//city and temperature. Your program should convert
		//Fahrenheit into celsius and print 
		//“The temperature is the city __ is __”
		
		
		Scanner city=new Scanner(System.in);
		
		System.out.println("Type of city");
		
		String name=city.nextLine();
		
		System.out.println("Type of temperature");
		
		double num=city.nextDouble();
		
		int celcius=(int) (((num-32)*5)/9);
		
		System.out.println("The temperature in "+name+" is "+celcius);
		
		
		
		
		
		
		
		
		
	}

}
