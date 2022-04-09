package JavaClass30Maps;

import java.util.ArrayList;

public class Task7 {
    //Create a collection of integers in which you can keep duplicates.
    //Write a logic to find sum of all integers
    public static void main(String[] args) {

        ArrayList<Integer> dup = new ArrayList<>();
        dup.add(10);
        dup.add(10);
        dup.add(10);
        dup.add(10);
        dup.add(10);
        dup.add(10);

        int sum=0;
        for (int i = 0; i < dup.size(); i++) {
           sum+=dup.get(i);
        }
        System.out.println(sum);

    }
}
