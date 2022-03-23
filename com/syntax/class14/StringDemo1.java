package com.syntax.class14;

public class StringDemo1 {

	public static void main(String[] args) {
	
		
		String name ="Shahima";
		String name2 = new String ("SHAHIMA  in all uppercase ");
		

		System.out.println(name2.length());
		System.out.println(name.length());
		String newName=name2.toLowerCase();
		System.out.println(name2.toLowerCase());
		System.out.println(name2.toUpperCase());
		//name=null;
	
        System.out.println(name.concat(name2));
        name="    ";
        System.out.println(name.isEmpty());

	}

}
