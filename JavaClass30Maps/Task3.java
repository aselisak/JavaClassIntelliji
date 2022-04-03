package JavaClass30Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task3 {
    //Create a map of Best Buy store. Place
    //item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
    //Retrieve all keys and values from a Best Buy map using EntrySet.
    public static void main(String[] args) {

        HashMap<Integer, String> bestBuyStore = new HashMap<>();
        bestBuyStore.put(123, "Printer");
        bestBuyStore.put(758, "TV");
        bestBuyStore.put(6587, "Modem");
        bestBuyStore.put(7854, "XBox");
        bestBuyStore.put(965, "Ipad");

        Iterator<Map.Entry<Integer,String>> iterator=bestBuyStore.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.print(entry + " ");

        }
    }
}
