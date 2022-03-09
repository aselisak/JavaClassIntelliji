package Replits;

import java.util.Scanner;

public class Replit77 {
    public static void main(String[] args) {
        //Create an array of integers that will store 5 elements taken from a user
        //Don't print any prompt message for the user
        //Then print out all the elements you have created in the first loop in reverse order.

        int[] []numbers= {
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1}

        };
            for (int i=0; i<2; i++){
                for (int x=0; x<5; x++){
                    System.out.println(numbers[i][x]);
                }
            }
    }
}
