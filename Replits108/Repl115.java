package Replits108;

import java.util.Locale;

public class Repl115 {
    //Create a method that will accept a String as a parameter and return new String all in upper case
    void print(String s){
        System.out.println(s.toUpperCase(Locale.ROOT));
    }

    public static void main(String[] args) {
        Repl115 obj = new Repl115();
        obj.print("test");
    }
}
