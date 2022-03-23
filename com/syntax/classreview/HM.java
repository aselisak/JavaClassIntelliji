package com.syntax.classreview;

import java.util.Scanner;

public class HM {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		        System.out.println("Please enter your gender: ");
		        String gender = input.next();

		        System.out.println("Please enter your age: ");
		        int age = input.nextInt();

		        if(gender.equalsIgnoreCase("M")){
		            if(age>25){
		                System.out.println("Man");
		                
		            } else{
		                System.out.println("Boy");
		            }
		        } else if(gender.equalsIgnoreCase("F")){
		            if(age>25){
		                System.out.println("Woman");
		            } else {
		                System.out.println("Girl");
		            }

		        } input.close();
		    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


