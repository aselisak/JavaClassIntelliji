package JavaClass28;

import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manuela Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("selenium");
        System.out.println(courses);
        /*for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).equals("Java")) {
               courses.remove("Java");
            }
        }*/

        System.out.println(courses);
    }
}