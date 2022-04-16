package Review12;

import util.ArrayUtil;

import java.util.ArrayList;
import java.util.Objects;

public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Mango");



        fruit.remove("mango");
        System.out.println(fruit);
        ArrayList<Fruit> f = new ArrayList<>();
        f.add(new Fruit("Apple"));
        f.add(new Fruit("Orange"));
        f.add(new Fruit("Mango"));
        f.remove(new Fruit("Mango"));
        System.out.println(f);

    }
}
class Fruit{
    String name;
    Fruit (String name){
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name);
    }
// by default toString method from the object class is used to printout an object,
//but it only prints the addresses of objects if we want to print out the actual fields of a class we override to string method

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}