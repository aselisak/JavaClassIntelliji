package Replits;

import java.util.Scanner;

public class Replit100 {
    public static void main(String[] args) {
        //Given the following inputs:
        //String s;
        //Write a for loop that will print out the reverse of the string.
        //Sample input/outputs:

        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        String reverseString="";
        for (int i=s.length()-1; i>=0; i--){
            reverseString=reverseString+s.charAt(i);
        }
        System.out.println(reverseString);

    }
}
