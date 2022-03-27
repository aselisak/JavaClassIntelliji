package JavaClass27CollectionsFramework;

import java.util.ArrayList;

public class ClassTask1 {
    public static void main(String[] args) {
        //Create an ArrayList that will store 5 names into it.
        //Find out whether the given ArrayList is empty or not?
        //Check whether the specific name is present in an ArrayList or not?
        //Find the size of your arrayList and print all values from that


        ArrayList<String> names = new ArrayList<>(5);
        names.add("Asel");
        names.add("John");
        names.add("Smith");
        names.add("Mike");
        names.add("Kim");

        if(!names.isEmpty()){System.out.println("not empty");}
        else{System.out.println("is empty");}

        if(names.contains("Asel")) {System.out.println("present");}
        else{System.out.println("not present");}

        System.out.println(names.size());
        ArrayList<String> num = new ArrayList<>(2);
        System.out.println(num);

    }
}
