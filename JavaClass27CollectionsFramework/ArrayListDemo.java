package JavaClass27CollectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Double> numberList = new ArrayList<>();
        Double double1 = new Double(10.5);
        double number1=double1.doubleValue();//unboxing is when we convert wrapper to primitive
        Double number2 = new Double(number1);//converting primitive to the wrapper is boxing
        Double number3=10.5;//autoBoxing
        Double number4= number3;
        number3=number4;//autoUnboxing
        // we need this because primitive works in collection frameworks by using wrapper converting

        String name = new String("Hakan");
        String name1="Hakan";

    }
}
