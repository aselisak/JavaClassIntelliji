package JavaClass19;

public class Car {
    String name="toyoto";
    String make;
    String color;
    String type;

    public Car(String name, String make, String color, String type) {
        this.name = name;
        this.make = make;
        this.color = color;
        this.type = type;
    }
    Car (){

    }

    void printCar(){
        String name = "Tesla";
        System.out.println(name);
        System.out.println(this.name);
    }
}


