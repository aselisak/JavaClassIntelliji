package JavaClass25Interfaces;

public interface Human {
    // public static final redundant because by default all the variables are public static final
    //public static final int legs=2;
            int legs=2;
   //public static void walk();
            void walk();
            static void printLegs(){
                System.out.println(legs);//is allowed
            }
            public default void noNeedToWorry(){
                System.out.println("default method are there to support functional programming");
            }
}
interface LivingBeing{
static void printLegs(){
        System.out.println("not sure");//is allowed
        }
        }
class Maha implements Human, LivingBeing{
    @Override
    public void walk() {
        System.out.println("I can walk");
    }

    public static void main(String[] args) {
        Maha maha = new Maha();
        maha.walk();
        //Maha.printLegs();not allowed in child class to call interface parent class static method
        Human.printLegs();
        LivingBeing.printLegs();
    }
}