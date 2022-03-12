package Replits;

public class Replit88 {
    //In this class, you should specify the following attributes:
    // breed, name, color, and following behaviors: bark(), run(), play().
}
class Main3{
    String breed;
    String name;
    String color;

    void bark(){
        System.out.println(breed+" can bark");
    }
    void run(){
        System.out.println(breed+" can run");
    }
    void play(){
        System.out.println(breed+" can play");
    }

    public static void main (String[] args){

        Main3 dog = new Main3();
        dog.breed="Husky";


        dog.bark();
        dog.run();
        dog.play();

        dog.breed="Bulldog";
        dog.bark();
        dog.run();
        dog.play();

        dog.breed="Labrador";
        dog.bark();
        dog.run();
        dog.play();

    }

}