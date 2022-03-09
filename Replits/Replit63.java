package Replits;

import java.util.Scanner;

public class Replit63 {
    public static void main(String[] args) {
        //int x;
        //Write a for loop that will print out a series of numbers starting at 0 and ending at the x(value must be taken from a user), exclusive.

        Scanner scan = new Scanner(System.in);
        int x= scan.nextInt();

        for (int i=0; i<x; i++){
            System.out.print(i+" ");
        }



    }
}
