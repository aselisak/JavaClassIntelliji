package Replits132;

public class Repl134 {

    int countVowels(String s){
        s=s.replaceAll("[^Aa,Ee,Ii,Oo,Uu]","");


        return s.length();
    }


    public static void main(String[] args) {
         Repl134 a= new Repl134();
        System.out.println(a.countVowels("obama")); //3
        System.out.println(a.countVowels("happy friday! i love weekends")); //9
    }
}
