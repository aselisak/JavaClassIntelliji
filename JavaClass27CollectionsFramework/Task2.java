package JavaClass27CollectionsFramework;

public class Task2 {
    public static void main(String[] args) {
        A a = new A(95,96,98);
        System.out.println(a.getPercentage());
        B b = new B(85,96,78,65);
        System.out.println(b.getPercentage());
    }
}
abstract class Marks{
    abstract double getPercentage();
}
class A extends Marks{
   private double a,b,c;

    A(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    double getPercentage() {
        return(a+b+c)/3;

    }
}
class B extends Marks{
    private double a,b,c,e;
      B(double a, double b, double c, double e){
          this.a=a;
          this.b=b;
          this.c=c;
          this.e=e;
    }
    @Override
    double getPercentage() {
        return (a+b+c+e)/4;

    }
}