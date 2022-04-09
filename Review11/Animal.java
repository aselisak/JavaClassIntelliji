package Review11;

public class Animal {
    void Sleep(){
        System.out.println("Animals sleep");
    }
}
class Dog extends Animal{
    void Sleep(){
        System.out.println("Dog sleeps in the day");
    }
}
class Cat extends Animal{
    void Sleep(){
        System.out.println("Cat sleeps all the day");
    }
}
class Test2{
    //public static void main(String[] args) {
       // Cat cat = new Dog();not possible
        //Cat cat = new Animal(); down-casting
        Animal animal = new Cat();//upcasting
       // Dog d=animal;no possible
      // Dog dog = (Dog)animal;
      // dog.Sleep();

   // }





    }
