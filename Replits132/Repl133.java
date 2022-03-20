package Replits132;

import java.util.Locale;

public class Repl133 {

       static  int countA(String s){
             int counter=0;
             for (int i=0; i<s.length(); i++){
                 if(s.toLowerCase(Locale.ROOT).charAt(i) == 'a')counter++;
             }
             return counter;
         }




    public static void main(String[] args) {
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA"));
    }
}
