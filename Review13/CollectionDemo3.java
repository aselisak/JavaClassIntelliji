package Review13;

import java.util.ArrayList;

public class CollectionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            names.add("sjhbdgskkjsafjaksfjkabfjkabfakjbf");
        }
        long startTime = System.currentTimeMillis();
        long count = names.stream().filter(x->x.length()>5).count();//similar to the loops process the elements one by one
        long endTime=System.currentTimeMillis();

        System.out.println(endTime-startTime);

        long startTime1 = System.currentTimeMillis();
        long count1 = names.parallelStream().filter(x->x.length()>5).count();//we are trying to count the elements, divide the task
        // to all them
        long endTime1=System.currentTimeMillis();
        System.out.println(endTime1-startTime1);


    }
}