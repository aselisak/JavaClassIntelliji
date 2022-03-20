package Replits108;

public class Repl168 {
    //Create an instance final method that will reverse a String and return that new String

        public static void main(String[] args) {
            finalMethod obj = new finalMethod();
            System.out.println(obj.reversing("Hello"));

        }}

    class finalMethod{
        final String reversing(String word){
            String reversedWord="";
            for (int i=word.length()-1;i>=0; i--){
                reversedWord=reversedWord+word.charAt(i);
            }
            return reversedWord;
        }
    }



