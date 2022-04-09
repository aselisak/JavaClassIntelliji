package Replits132;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Repl203 {
    public static void main(String[] args) {
        HashMap<String, Integer> fruits = new HashMap<>();
        fruits.put("mango", 10);
        fruits.put("apple", 30);
        fruits.put("orange", 20);
        fruits.put("mango", 40);
        fruits.put("mango", 40);
        Iterator<Map.Entry<String, Integer>> iterator = fruits.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry + " ");
        }
    }
}