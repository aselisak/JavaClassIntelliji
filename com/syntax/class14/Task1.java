package com.syntax.class14;

public class Task1 {
	
void printLarger(int num1, int num2) {
		if (num1>num2) {
			System.out.println(num1+" is greater");
		}else if (num2>num1){
			System.out.println(num2+" is greater");
		}else {
			System.out.println("numbers are the same");
		}
	}
	
	
	
	

	public static void main(String[] args) {
		
		Task1 obj = new Task1();
		obj.printLarger(1526, 456);
		obj.printLarger(156, 456);
		obj.printLarger(1526, 1526);
		
		
		
	}

}
