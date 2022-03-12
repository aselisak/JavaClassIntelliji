package Replits;

public class Replit83 {
    public static void main(String[] args) {
        //Write a program that calculates the sum of elements from each row in a 2D array and adds them into array of integers
        //For example, if we run rowSums for the following 2D array:

        int [][] array = {
                {1,1,2},
                {3,1,2},
                {3,5,3},
                {0,1,2}
        };

        for (int i=0; i< array.length;i++){
            int sum=0;
            for (int j=0; j<array[i].length; j++){
                sum+=array[i][j];
            }
            System.out.println(sum);
        }


    }
}
