package JavaClass17;

public class HealthyDog {
    String name;
    String color;
    static int numberOfLegs;

    void eat(){
        int noOfTimes=3;
        System.out.println(name+" eats "+noOfTimes);

    }

    public static void main(String[] args) {
        HealthyDog dog = new HealthyDog();
        dog.name = "Scooby";
        dog.color= "Green";
        HealthyDog.numberOfLegs=4;
        dog.eat();

        HealthyDog dog2 = new HealthyDog();
        dog.name = "tomy";
        dog.color= "blue";
        HealthyDog.numberOfLegs=4;
        dog2.eat();



    }
}
