package JavaClass28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
        //Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.

        ArrayList<Integer> numbers = new ArrayList();
        for (int i = 2; i <=500; i+=2) {
            numbers.add(i);
        }

        numbers.removeIf(integer -> integer % 5 == 0);
        System.out.println(numbers);
        /* while(iterator.hasNext()){
            if(iterator.next()%5==0){
                iterator.remove();
            }
        }*/
        }

    }

