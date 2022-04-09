package Replits132;

import java.util.HashMap;

public class Repl201 {
    public static void main(String[] args) {
        HashMap<String,String> streets = new HashMap<>();
        streets.put("Street","Patrick ST");
        streets.put("Suite","265");
        streets.put("City","Vienna");
        streets.put("Zip","22180");
        streets.put("Country","United State");
        System.out.println(streets.size());
        streets.clear();
        System.out.println(streets.size());



    }
}
