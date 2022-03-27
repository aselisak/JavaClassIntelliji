package JavaClass27CollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo6 {
    public static void main(String[] args) {
     ArrayList<Integer>  a1 = new ArrayList<>();

        a1.add(10);
        a1.add(20);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        a1.add(1,100);
        System.out.println(a1);

       /* LinkedList<Integer> a=new LinkedList<>();
        a.add(10);
        a.add(20);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(1,100);
        System.out.println(a);*/

    }
}
