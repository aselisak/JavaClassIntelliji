package com.syntax.class13;

public class MethodsDemo3 {
	
	// int we specify the datatype that method will return
	// squareTheNumber name of the method
	//(int number) parameters of the method
	// return keyword tells java what to return from this method
	int squareTheNumber(int number) {
		return number*number;
	}
	 int returnTheSameNumber(int number) {
		 return number;
	 }
	
	String nameAnimal(String name, String animal) {
		if (name.equals("Teyfur") && animal.equals("Horse")){
			return "Camel";
		}else if ("Horse".equals(animal)) {
			return "Horse";
	}else {
		return "I don't know";
	}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo3 obj = new MethodsDemo3();
		
		int result=obj.squareTheNumber(5);
		
		System.out.println(result);


		
		System.out.println(obj.nameAnimal("Teyfur", "Horse"));
		System.out.println(obj.nameAnimal("Tarik", "Horse"));
		System.out.println(obj.nameAnimal("Teyfur", "Monkey"));
	}

}
