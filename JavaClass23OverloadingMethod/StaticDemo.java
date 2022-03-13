package JavaClass23OverloadingMethod;

public class StaticDemo {

}
class Cat{
    static int nuOfLegs=4;
    String name;

    public Cat(String name) {
        this.name=name;

    }

    public void printInfo(){
        System.out.println(name+" "+nuOfLegs);
    }

    public static void Print(){
        //System.out.println(name+" "+nuOfLegs);//we cannot access the instance field directly inside static methods
        //we can't use instance fields with static methods
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Stella");
        cat.printInfo();
        Cat cat2= new Cat("Nutella");
        cat.printInfo();
    }
}