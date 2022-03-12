package Replits;

public class Replit151 {

        int[][] a = {
                {1, 2, 3},

                {4, 5, 6},

                {7, 8, 9}

        };

     void calculate(){
         int sum=0;
         for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                sum+=a[i][j];

            }
        } System.out.print(sum+" ");

    }


        public static void main(String[]args){

         Replit151 method = new Replit151();
         method.calculate();

        }
        }