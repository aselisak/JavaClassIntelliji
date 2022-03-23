package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkTask3 {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Is there a sale?");
	
	String sale=scan.next();
	
	if (sale.equalsIgnoreCase("Yes")) {
		System.out.println("What is the price for the item?");
		int price=scan.nextInt();
		int result;
		
		if (price<20) {
			result=(price*10)/100;
		}else if (price>20 && price<100) {
			result=(price*20)/100;
		}else if (price>100 && price<500) {
			result=(price*30)/100;
		}else {
			result=(price*50)/100;
		}
		
		int priceAfter=price-result;
		System.out.println("After discount % "+result+" the price of the item reduce from "+price+" to "+priceAfter);
		
	    }else {
	    	System.out.println("I am not going to shopping");
	    }
	
		
	    scan.close();
		
		
		
		
		
		

	}

}
