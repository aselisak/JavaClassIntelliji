package JavaClass24Polymorphizm;

public interface Employee {// is a similar class which is collection of public static final variables(constants) and public abstract methods
    public static final int age=10;
    /*
    by default all the variables in an interface are public do not static final
     */
    void work();
    /*
    All the methods inside an interface which do not have body are abstract and public
     */
}
class Tester implements Employee{
    @Override
    public void work() {System.out.println("Testing a website");}

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.work();
        System.out.println(Employee.age);
    }
}