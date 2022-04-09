package Replits132;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Repl200 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> streets = new LinkedHashMap<>();
        streets.put("Street","Patrick ST");
        streets.put("Suite","265");
        streets.put("City","Vienna");
        streets.put("Zip","22180");
        streets.put("Country","United State");
        streets.values();
        Collection<String> values = streets.values();
        Iterator<String> iterator = values.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
