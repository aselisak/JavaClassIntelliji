package Replits;

import java.util.Scanner;

public class Replit101 {
    public static void main(String[] args) {
        //Write a for loop that will print out every other letter in a String, starting with the first letter.
        // These letters should be printed all on one line with no space in between.

        Scanner inp = new Scanner(System.in);
        String word = inp.next();
        for (int i=0; i<word.length(); i+=2){
            System.out.print(word.charAt(i));
        }

inp.close();
    }
}
