package Replits;

import java.util.Locale;

public class Replit106 {
    public static void main(String[] args) {
        //Instantiate and StringBuffer class
        //Append Value "Hello" to it
        //Append value "World" to it.
        //Print in UPPERCASE.

        StringBuffer str = new StringBuffer();
        str.append("Hello");
        str.append(" World");

        String appendWord = str.toString().toUpperCase(Locale.ROOT);
        System.out.println(appendWord);
    }
}
