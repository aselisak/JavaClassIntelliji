package com.syntax.class02;

public class Arithmetics {

	public static void main(String[] args) {
	
		double a1=30;
		double a2=20;
		
		double sum=a1+a2;
		double sub=a1-a2;
		double div=a1/a2;
		double mult=a1*a2;
		double remainder=a1%a2;		
		
	System.out.println("The sum of 2 numbers "+ a1 + " and "+ a2 + " is equal to " +sum);
	System.out.println("The substraction of 2 numbers "+a1+ " and " +a2+ " is equal to "+sub);
	System.out.println("The division of 2 numbers "+a1+ " and "+a2+" is equal to "+div);
	System.out.println("The multiples of 2 numbers "+a1+ " and "+a2+" is equal "+mult);
	System.out.println("The remainder of 2 numbers"+a1+" is equal "+remainder);
	   
	  //task 2
	//Write a program to find the square of the number 3.9. 
	//You program should say “The square of the ____ is ____ ”
	double a3=3.9;
	double a4=15.99;
	System.out.println("The square of the "+a3+" is "+a4);
	//Task 3Write a program to print
	//the area and perimeter of 
	//a rectangle with width = 5 and  height = 8. 
	//Your program should say. 
	//“The perimeter of a rectangle 
	//with width ___ and height ____ is equal to _____ 
	//and the area is __”
	
	int width=5;
	int height=8;
	
	int perimeter=2*(width + height);
	int area=width * height;
	System.out.println("The perimeter of rectangle with width = "+perimeter+" and the are is "+area);
	
	String a="Hello";
	String b="Bye";
	int c=10;
	int d=20;
	
	 System.out.println(c+d+a+b);// 30HelloBye
	 System.out.println(a+b+c+d);// HelloBye1020
	 System.out.println(a+b+(c+d));// HelloBye30
	 
	 int num=123;
	 String num2="123";
	 System.out.println(num+num2);//123123
	 
	
	
	
	
	
	
	

	
	

	}

}
