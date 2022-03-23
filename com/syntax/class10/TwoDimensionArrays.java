package com.syntax.class10;

public class TwoDimensionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[][] numbers=new int[3][4];
		// 1 row or 1 array
		
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		
		//2 row of second array
		
		numbers[1][0]=100;
		numbers[1][1]=200;
		numbers[1][2]=300;
		numbers[1][3]=400;
		
		//3 row of third array
		
		numbers[2][0]=1000;
		numbers[2][1]=2000;
		numbers[2][2]=3000;
	    numbers[2][3]=4000;
		
		
		System.out.println(numbers[1][2]);//300
		System.out.println(numbers[0][1]+numbers[1][0]);
	}

}
