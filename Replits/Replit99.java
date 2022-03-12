package Replits;

import java.util.Scanner;

public class Replit99 {
    public static void main(String[] args) {
        //Write code that will take in a String input and check to see if it is a palindrome or not.
        //A palindrome means that the characters are the same forwards and backwards, ignoring spaces.

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        String reverseString="";
        //write your code below

        for (int i=givenString.length()-1; i>=0; i--){
            reverseString=reverseString+givenString.charAt(i);
        }
        if (givenString.equalsIgnoreCase(reverseString)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        inp.close();
    }
}




