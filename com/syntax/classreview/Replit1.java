package com.syntax.classreview;

import java.util.Scanner;

public class Replit1 {

	public static void main(String[] args) {
	
		
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Is it sunny outside?");
        
           boolean sunny=scan.nextBoolean();
         if (sunny) {
        	 System.out.println("I should go somewhere");
        	 System.out.println("what is the temperarure?");
        	 int temp=scan.nextInt();
        	 if (temp>85) {
        		 System.out.println("I will go to the beach");
        	 }else 
        		 System.out.println("I will go to the park");
        	 }else 
        		 System.out.println("I stay home");
         
         scan.close();
               }
        	 
        	
        
     
		
		
		
		
		
		
		
		
		
	}


