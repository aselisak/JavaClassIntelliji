package Replits;

public class Replit80 {
    public static void main(String[] args) {
        //Write a program to double the values of every element in the array and print it out.

        double[][] a = {
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };

for (int i=0; i<3; i++){
    for (int x=0; x<4; x++){
        System.out.print(a[i][x]*2+" ");
    }
    System.out.println();
}


    }
}
