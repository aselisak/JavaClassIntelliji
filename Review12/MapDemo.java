package Review12;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> personInfo = new HashMap<>();
        personInfo.put(1111111,"Manana");
        personInfo.put(1256451,"Salim");
        personInfo.put(3654123,"Gulden");
        personInfo.put(4563214,"Pot");
        personInfo.put(6541236,"Eric");

        for (Map.Entry<Integer,String> entry: personInfo.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
