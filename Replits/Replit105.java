package Replits;

import java.util.Scanner;

public class Replit105 {
    public static void main(String[] args) {
        //There is a code that takes input as a String.
        //Write a program that will print out only vowels of that string
        //Sample input/outputs:

        Scanner inp = new Scanner(System.in);
        String word = inp.next();
        System.out.println(word.replaceAll("[^aeiouAEIOU]",""));
        inp.close();
    }
}
