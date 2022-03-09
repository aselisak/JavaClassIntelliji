package Replits;

public class Replit79 {
    public static void main(String[] args) {
        //Write a program to print values from a 2D array

        double [][] array=new double[3][4];
 //first array
        array[0][0]=1.4;
        array[0][1]=2.0;
        array[0][2]=3.3;
        array[0][3]=2.0;
 //second array
        array[1][0]=4.0;
        array[1][1]=1.5;
        array[1][2]=6.1;
        array[1][3]=1.0;

//third array
        array[2][0]=1.2;
        array[2][1]=3.1;
        array[2][2]=4.0;
        array[2][3]=1.6;


        for (int i=0; i<3; i++){
            for (int x=0; x<4; x++){
                System.out.print(array[i][x]+" ");
            }System.out.println();
        }

    }
}
