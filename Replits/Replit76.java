package Replits;

import java.util.Scanner;

public class Replit76 {
    public static void main(String[] args) {
        //Write a program that creates a String array with size 7.
        //Ask the user to input Days of a week beginning with Sunday using Scanner class.
        //Add these inputs to your array and then print all values from that array
        //Example:
        //Please enter day 1 of the week
        //Sunday
        //Please enter day 2 of the week
        //Monday
        //Please enter day 3 of the week
        //Tuesday etc

        Scanner scan = new Scanner(System.in);
        int size=7;
        String [] days={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (int i=0; i<7; i++){
            System.out.println("Please enter the day");
            days[i]=scan.next();
        }
        for (int i=0; i<size; i++){
            System.out.println(days[i]);
        }


    }
}
