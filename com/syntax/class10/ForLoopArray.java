package com.syntax.class10;

public class ForLoopArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars= {"Audi", "BMW", "Honda", "Ford", "KIA", "Lexus"};
		
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]+" ");
		}
		
		System.out.println("-------------------------------");
		
		for(String car:cars) {
			System.out.print(car+" ");
		}
		
		

	}

}
