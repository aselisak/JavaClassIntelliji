package com.syntax.class09;

public class Array {

	public static void main(String[] args) {
		// Array []it is a group values of int type
		
		
		
		
		int[] numbers=new int[4];// storing values that holds 4 elements
		
		// storing values/element inside an array
		numbers[0]=90;
        numbers[1]=87;
        numbers[2]=89;
        numbers[3]=99;
        
        // I want to print 99
        System.out.println(numbers[3]);
        System.out.println(numbers[3]+numbers[0]);//189
        
        
        //I want to create an array of countries
        
        String[] countries=new String[6];
        
        countries[0]="USA";
        countries[1]="Canada";
        countries[2]="Afganistan";
        countries[3]="Moldova";
        countries[4]="Morocco";
        countries[5]="Turkey";
        
        System.out.println(countries[5]);
        System.out.println(countries[3]+" "+countries[4]);
        
        System.out.println("-----------------------------");
        
        String[] names=new String[5];
        
        names[1]="Orsan";
        names[2]="Gulnar";
        names[4]="Zakirullah";
        System.out.println(names[1]);
        
        System.out.println("Value in index 4 is = "+names[0]);
        
        names[1]="Daniyar";
        
        System.out.println(names[1]);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
