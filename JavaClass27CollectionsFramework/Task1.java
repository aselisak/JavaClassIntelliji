package JavaClass27CollectionsFramework;

public class Task1 {
    public static void main(String[] args) {
        Shape shape =new Square();
        shape.calculatePerimeter(10);

    }
}
interface Shape{
   void  calculateArea(double input);
   void calculatePerimeter(double input);
}
class Circle implements Shape{

    @Override
    public void calculateArea(double input) {
       double area = Math.PI*Math.pow(input,2);
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter(double input) {
      double perimeter=2*Math.PI*input;
        System.out.println(perimeter);
    }
}
class Square implements Shape{

    @Override
    public void calculateArea(double input) {
        double area=input*input;
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter(double input) {
      double perimeter= 4*input;
        System.out.println(perimeter);
    }
}