package Replits;

import java.util.Scanner;

public class Replit65 {
    public static void main(String[] args) {
        //Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.

        Scanner scan = new Scanner(System.in);
        int x= scan.nextInt();
        for (int i=x; i>=0; i--){
            System.out.print(i+" ");
        }

    }
}
