package JavaClass28;

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manuela Testing");
        courses.add("Java");
        courses.add("GIT");
        courses.add("selenium");
        courses.add("TestNg");
        courses.add("Cucumber");
        courses.add("SQL");
        courses.add("API");
        courses.add("Jenkins");
        courses.add("Interview");
        courses.add("AWS");
        courses.add("APM");
        courses.add("Docker");
        courses.add("Dead");
        System.out.println(courses);

        courses.set(courses.size()-1, "Happy");
        System.out.println(courses);
        courses.set(4,"Happy");
        System.out.println(courses);




    }
}
