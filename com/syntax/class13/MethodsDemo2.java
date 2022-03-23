package com.syntax.class13;

public class MethodsDemo2 {
	
	
	void TeyfurAndHorse (String name, String animal) {
		if ("Teyfur".equals(name) && "Horse".equals(animal)) {
			
			System.out.println("Camel");
		}else {
			System.out.println("Horse");
		}
	}
	

	public static void main(String[] args) {
		
		MethodsDemo2 obj = new MethodsDemo2();
		
		obj.TeyfurAndHorse("Teyfur", "Horse");
		
		obj.TeyfurAndHorse("TARIK", "Horse");
		
		
	}

}
