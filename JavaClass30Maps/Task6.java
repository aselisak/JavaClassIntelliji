package JavaClass30Maps;


import java.util.LinkedHashSet;

public class Task6 {
    //Create the collection that will store single uniques Objects of a String type in which order is preserved.
    //Write a logic to concatenate all string from the collection.
    public static void main(String[] args) {
        LinkedHashSet<String> drinks = new LinkedHashSet<>();
        drinks.add("Coke");
        drinks.add("Vodka");
        drinks.add("tequila");
        drinks.add("margarita");
        drinks.add("link");

        String allDrinks="";
        for (String drink:drinks){
            allDrinks+=drink;
        }
        System.out.println(allDrinks);


    }
}
