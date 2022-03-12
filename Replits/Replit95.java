package Replits;

import java.util.Scanner;

public class Replit95 {
    public static void main(String[] args) {
        //Using Scanner class input string value.
        //Print out the following: "The first 3 letters of ___ is ___"
        //For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".

        Scanner sc = new Scanner(System.in);
        String name =sc.next();
        System.out.println(name.substring(0,3));

    }
}
