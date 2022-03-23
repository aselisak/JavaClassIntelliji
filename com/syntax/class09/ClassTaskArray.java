package com.syntax.class09;

public class ClassTaskArray {

	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		
		
		char[] grades=new char[6];
		
		grades[0]='A';
		grades[1]='B';
	    grades[2]='C';
	    grades[3]='D';
	    grades[4]='E';
	    grades[5]='F';
		
		System.out.println(grades[1]);
		
		System.out.println("-------2 way-------");
		
		char[] grades1= {'A', 'B', 'C', 'D','E','F'};
		
		//how many elements inside array?
		
		int size=grades1.length;
		System.out.println("Number of elements is = "+size);
		
		//System.out.println(grades[1]);
		//System.out.println(grades[2]);
		//System.out.println(grades[3]);
		
		System.out.println("----------------------------");
		
		for (int i=0; i<grades1.length; i++) {
			System.out.print(grades1[i]+" ");
		}
		
		
	}

}
