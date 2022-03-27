package JavaClass28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Task2 {
    public static void main(String[] args) {
        //Create an arrayList of words. Remove every word that ends with “e”.

        ArrayList<String> words = new ArrayList();
        words.add("Java");
        words.add("Love");
        words.add("Lahore");
        words.add("cake");

       // words.removeIf(s -> s.toLowerCase(Locale.ROOT).endsWith("e"));
       // System.out.println(words);
        Iterator<String> iterator=words.iterator();
        while(iterator.hasNext()){
            if(iterator.next().toLowerCase(Locale.ROOT).endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words);
    }
}
