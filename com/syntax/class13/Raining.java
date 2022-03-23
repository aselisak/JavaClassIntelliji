package com.syntax.class13;

public class Raining {
	
	
	boolean raining;
	
	
	void weather(boolean isRaining) {
		if (isRaining) {
			System.out.println("Im staying home");
		}else {
			System.out.println("lets go for a walk");
		}
	}
	
	void checkPerson(String name) {
		if ("Teyfur".equals(name)) {
			System.out.println("send memes");
		}else if ("Maha".equals(name)) {
			System.out.println("Doctor");
		}else {
			System.out.println("Uknown");
		}
	}
	
	public static void main(String[] args) {
		
		
		Raining object = new Raining();
		
		object.weather(false);
		object.checkPerson("Teyfur");
		

	}

}
