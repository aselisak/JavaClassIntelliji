package JavaClass29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task1 {
    //How can you remove all duplicates from ArrayList?
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        LinkedHashSet linkedHashSet = new LinkedHashSet<>(aList);
        aList.clear();
        aList.addAll(linkedHashSet);
        System.out.println(aList);



    }
}
