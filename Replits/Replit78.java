package Replits;

import java.util.Scanner;

public class Replit78 {
    public static void main(String[] args) {
        //Create an int array of integers with a size of 5 and input values with Scanner.
        //Don't print prompt questions for a user.
        //Using loop print out each element of the array that should look like the output below

        Scanner scan = new Scanner(System.in);
        int size =5;
        int []num=new int[5];
        for (int i=0; i<5; i++){
            num[i]=scan.nextInt();
            System.out.println(num[i]*10);
        }


    }
}
