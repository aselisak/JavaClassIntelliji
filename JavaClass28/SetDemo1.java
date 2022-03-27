package JavaClass28;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        LinkedHashSet<String> fruit = new LinkedHashSet<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Apple");
        System.out.println(fruit);
    }
}
