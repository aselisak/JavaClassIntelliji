package Replits;

public class Replit75 {
    public static void main(String[] args) {
        //Using the following array.
        //{45, 78, 12, 67, 55, 89, 23, 77, 88}
        //Create a for loop to extract values from that array so your output looks as below:
        //78 55 77

        int [] array ={45, 78, 12, 67, 55, 89, 23, 77, 88};

        for (int i=1; i<array.length; i+=3){
            System.out.println(array[i]);
        }



    }
}
