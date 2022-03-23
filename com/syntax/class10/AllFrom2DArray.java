package com.syntax.class10;

public class AllFrom2DArray {

	public static void main(String[] args) {
		
		
		
		String [][]food= {
				{"redbull","burger", "steak", "fries" },
				
				{"curry", "biriyani", "butter chicken"},
				
				{"noodles", "pad thai", "tom yum"},
				
				{"pizza", "pasta"}
		};
		
		System.out.println("ALL VALUES FROM 2D ARRAY USING FOR EACH LOOP");
		System.out.println();
		// iterates over every array/row
		
		
		for(String[] cousine:food) {
		     for(String f:cousine) {
		    	 
		    	  System.out.print(f+" ");
		     }
		     System.out.println();
		    	
		     }
		
		
		System.out.println();
		
		for (int row=0; row<food.length; row++) {
			
			//iterate over every column of specified row
			
			for (int col=0; col<food[row].length; col++) {
				
				// accessing elements
				
				System.out.print(food[row][col]+" ");
			}
			System.out.println();
		}
		
		
	
		

	}

}
