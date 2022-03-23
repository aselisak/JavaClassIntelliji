package com.syntax.classreview;

public class NetedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int price=10;
		boolean sale=true;
		char gender='F';
		double discount=0.15;
		double finalPrice=0;
		
		if (sale) {
			if (gender=='F') {
				if(price>5) {
					finalPrice=price-price*discount;
					System.out.println("line 1");
				}
			}
		}else {
			finalPrice=price;
			System.out.println("line 2");
		}
	
		if (sale && gender=='f' && price>5) {
			System.out.println("line 1");
		}else {
			System.out.println("line 2");
		}
		
	}

}
