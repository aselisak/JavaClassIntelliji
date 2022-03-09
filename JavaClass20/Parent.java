package JavaClass20;

public class Parent {
    private String name;//private members don't participate in inheritance
    int age;
    protected double weight;
    public String color;

}

class Child extends Parent{
    void printInfo(){
        //System.out.println(name); private cannot open
        System.out.println(age);
        System.out.println(weight);
        System.out.println(color);
    }
}
