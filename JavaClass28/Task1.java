package JavaClass28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {

        /*ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Nissan");
        cars.add("Mazda");
        cars.add("Honda");
        System.out.println("------------first way-----------");
        Iterator<String> iterator = cars.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println("-----------second way---------------");

        Iterator<String> iterator1 =cars.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("--------------3rd way-----------------");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(((String)cars.get(i)));
        }*/

        //ArrayList<String> cars= new ArrayList<>(Arrays.asList("BMW"),"Audi","Porsche"); will discuss this approach

        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Porsche");
        System.out.println(cars);

        for (String car:cars
             ) {
            System.out.println(cars);
        }
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        int i=0;
        while(i<cars.size()){
            System.out.println(cars.get(i));
            i++;
        }
    }
}
