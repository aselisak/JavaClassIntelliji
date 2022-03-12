package Replits;

import java.util.Scanner;

public class Replit104 {
    public static void main(String[] args) {
        //Create an array of names that will hold 5 String elements.
        //Names must be taking from a user.
        //Print out the first three characters of each element of the array, one per line.
        //Note: every array element must be at least 3 characters long.

        Scanner user = new Scanner(System.in);
        String [] name= new String[5];
        for (int i=0; i<name.length; i++){
            name[i]=user.next();
        }
        for (String arr:name){
            System.out.println(arr.substring(0,3));
        }
        user.close();
    }
}
