package JavaClass30Maps;

import sun.awt.image.ImageWatched;

import java.util.*;

public class Task1 {
    //Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..).
    // Insert 7 entries with duplicate keys and values.
    //Check how many entries you have?
    //Update company on a 4th floor
    //Remove company on the 7th floor
    //Print your map
    public static void main(String[] args) {
        HashMap<Integer,String> building= new HashMap<>();
        building.put(1,"Google");
        building.put(2,"Apple");
        building.put(3,"Tesla");
        building.put(1,"Amazon");
        building.put(5,"Amazon");
        building.put(4,"Syntax");
        building.put(7,"Multiverse");
        System.out.println(building.size());
        building.replace(4,"Facebook");//update the value
        System.out.println(building);
        building.remove(7);
        System.out.println(building);









    }
}
