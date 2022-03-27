package JavaClass28;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList <String >arr = new ArrayList();
        arr.add("10");
        arr.add("name");
        /*arr.add(12.5);
        arr.add(true);*/

        for (int i = 0; i < arr.size(); i++) {
            System.out.println( ((String)arr.get(i)).length());
        }


        System.out.println(arr);

    }
}
