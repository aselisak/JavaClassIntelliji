package com.syntax.classreview;

public class Patterns {

	public static void main(String[] args) {
		

		for (int i=1; i<=5; i++) {
			System.out.print("*");
		}System.out.println();

		for (int i=1; i<=5; i++) {
			System.out.print("*");

	    }System.out.println();
		for (int i=1; i<=5; i++) {
			System.out.print("*");
		
		}System.out.println();
		for (int i=1; i<=5; i++) {
			System.out.print("*");
		
	    }System.out.println();
		System.out.println("-------Better Way------");
	
	    
	    
	    
	    for (int r=1; r<=10; r++) {
	    	for (int col=1; col<=10; col++) {
	    		System.out.print(" * ");
	    	}System.out.println();
	    }System.out.println();
	    
	    for (int r=5; r>=1; r--) {
	    	for (int c=1; c<=4; c++) {
	    		System.out.print(r+" ");
	    	}System.out.println();
	    }System.out.println();
	    
	    for (int r=1; r<=4; r++) {
	    	for (int c=1; c<=5; c++) {
	    		if (r==1 || r==4 || c==1 || c==5){
	    		
	    		System.out.print("*");
	    		}else {
	    			System.out.print(" ");
	    		}
	    	
	    		}System.out.println();
	         	}
	    
	           for (int i=1; i<=5; i++) {
	        	   for (int j=1; j<=i; j++) {
	        		   System.out.print(i+" ");
	        		  
	        	   }System.out.println();
	           }
	           
	           for (int i=5; i>=1; i--) {
	        	   for (int j=1; j<=i; j++) {
	        		   System.out.print(i+" ");
	        	   }System.out.println();
	           }
	       
	
	
	
	
	
	
	
	
	
	
	
	
}
}