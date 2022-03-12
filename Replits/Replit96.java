package Replits;

import java.util.Scanner;

public class Replit96 {
    public static void main(String[] args) {
        //You have Scanner class to input string value.
        //If language is Java it should print the:
        //"Java is a programming language".
        //If language is C it should print the:
        //"C is a procedural programming language"
        //If language is C++ it should print the:
        //"C++ is a middle-level programming language"
        //If any other should print:
        //"Doesn't match any programming language"

        Scanner sc = new Scanner(System.in);
         String name=sc.next();
         if (name.equalsIgnoreCase("Java")){
             System.out.println("Java is 1");
         }
             else if (name.equalsIgnoreCase("c")){
             System.out.println("C is 2");
         }
              else if (name.equalsIgnoreCase("C++")){
             System.out.println("C++ 3");
         }
             else {
             System.out.println("invalid");
         }
sc.close();

    }
}
