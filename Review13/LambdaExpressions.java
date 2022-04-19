package Review13;

import java.util.ArrayList;

public class LambdaExpressions {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Orsan");
        names.add("Nassir");
        names.add("Mujeeb");
        names.add("Tolga");

      /* long m = names.stream().filter(x->x.contains("M")).count();
        System.out.println(m);*/
       long m= names.parallelStream().filter(x->x.contains("M")).count();
        System.out.println(m);
    }
}
