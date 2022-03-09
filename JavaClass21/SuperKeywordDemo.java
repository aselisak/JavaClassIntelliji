package JavaClass21;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child = new Child ();
        child.printColor();

   child.print();
    }
}
 class GrandParent{
    String color = "Black";
    void  printName(){ System.out.println("I am grandpa");  }



    }
    class Parent extends GrandParent{
    String color = "Blue";
    void printName(){ System.out.println("I am a parent");}

    }
    class Child extends Parent{
        String color = "Red";
    void printName(){ System.out.println("I am a child");}
        void print(){
            printName();
            super.printName();
        }



        void printColor() {
            String color = "green";//refers to local variable
            System.out.println(color);//refers to instance variable
            System.out.println(super.color);//bring the variable value from parent class=>refers to parent variable
        }
    }