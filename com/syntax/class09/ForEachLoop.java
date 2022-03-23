package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		
		//if you have an array you can use for each loop to iterate/loop through the entire array
		// for(dataType varName:nameOfTheArray){
		//syso(varName);}
		
		String[] cities= {"Washington DC","Boston", "Miami","Los Angeles", "New York"};		
		
		for(String city:cities) {
			System.out.println(city);
		}
		
		
		System.out.println("------------------------------------");
		
		
		int[] numbers= {10, 20, 30, 40};
		
		for(int num:numbers) {
			System.out.print(num+" ");
		}
		
		System.out.println("--------------------------------------");
		
		char[] grades1= {'A', 'B', 'C', 'D','E','F'};
		
		for(char grade:grades1) {
			System.out.print(grade+" ");
		}
		System.out.println("------------------");
		
		 String[] countries=new String[6];
		 
	        countries[0]="USA";
	        countries[1]="Canada";
	        countries[2]="Afganistan";
	        countries[3]="Moldova";
	        countries[4]="Morocco";
	        countries[5]="Turkey";
	        
	        for (String country:countries) {
	        	System.out.println(country);
	        }
	        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
