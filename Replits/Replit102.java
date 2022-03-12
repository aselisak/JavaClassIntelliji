package Replits;

import java.util.Scanner;

public class Replit102 {
    public static void main(String[] args) {
 //Write a for loop that will loop through every character of a word and print out each character, each on a separate line

        Scanner inp = new Scanner(System.in);
        String word=inp.next();
        for (int i=0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }

inp.close();
    }
}
