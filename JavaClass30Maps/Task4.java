package JavaClass30Maps;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
    //Create a Person class with following private fields: name, lastName, age, salary.
    //Variables should be initialized through constructor.
    //Inside the class also create a method to print user details.
    //In Test Class create a Map that will store key in ascending order.
    // In that map store personId and a Person Object.
    // Print each object details.
        TreeMap<String,Person> personTreeMap = new TreeMap<>();
        personTreeMap.put("a",new Person("Asel","Kiyatova",38,1250000));
        personTreeMap.put("b",new Person("Gulden","A",16,1400000));
        personTreeMap.put("c",new Person("Mr","A",22,1700000));
        personTreeMap.put("d",new Person("Nassir","Ariyan",27,1500000));

        for(Map.Entry<String,Person> p:personTreeMap.entrySet()){
            System.out.println(p);
        }
}
}
class Person{
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}


