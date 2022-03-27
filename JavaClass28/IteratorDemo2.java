package JavaClass28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo2 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manuela Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("selenium");

        Iterator<String> iterator =courses.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());//sdlc
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());//manuel testing
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());//java
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());//java
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());//selenium
        System.out.println(iterator.hasNext());


    }
}
