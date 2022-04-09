package JavaClass31;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable <String,String> students = new Hashtable();
        students.put("1","Moreed");
        students.put("2","Emilia");
        students.put("3","Medin");
        students.put("4","Yazgul");
        students.put("5","Gulden");

        Set<Map.Entry<String,String>> entrySet =students.entrySet();//nesting of data structure
        for(Map.Entry<String,String> entry:entrySet){
            System.out.println(entry);
        }





    }
}
