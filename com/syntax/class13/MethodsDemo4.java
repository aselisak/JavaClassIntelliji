package com.syntax.class13;

public class MethodsDemo4 {
	
	   
	
      double checkDiscount(Boolean sale, double originalPrice, double discount) {
		if (sale) {
			
			return (originalPrice-originalPrice*discount);
		}else {
			return originalPrice;
		}
			
	}

	public static void main(String[] args) {
		
		
		MethodsDemo4 obj = new MethodsDemo4();
		
		System.out.println(obj.checkDiscount(true, 100, .15));
		System.out.println(obj.checkDiscount(false, 100, .15));
		
		
	}

}
