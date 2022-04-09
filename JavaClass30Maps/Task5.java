package JavaClass30Maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task5 {

    public static void main(String[] args) {
        HashMap<String,Integer> employee = new HashMap<>();
        employee.put("Asel",150000);
        employee.put("Mira",154000);
        employee.put("John",160000);
        employee.put("Smith",170000);

        String name=null;
        Integer salary=0;
        for(Map.Entry<String,Integer> entry : employee.entrySet()){
            if(entry.getValue()>salary){
                salary= entry.getValue();
                name= entry.getKey();
            }
        }
        System.out.println(name+" =$ "+salary);

    }
}
