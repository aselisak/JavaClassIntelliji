package JavaClass27CollectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList();
        groceries.add("Apple");
        groceries.add("Orange");
        groceries.add("Banana");

        ArrayList<String> list2 = new ArrayList();
        list2.add("Potato");
        list2.add("Onion");
       // vegetables.add("Carrot");

        ArrayList<String> List2 = new ArrayList<>();
        groceries.addAll(groceries);
        groceries.addAll(list2);
        System.out.println(groceries);
        System.out.println(groceries.containsAll(list2));


    }
}
