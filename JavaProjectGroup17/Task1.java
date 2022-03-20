package JavaProjectGroup17;

public interface Task1 {
    //Create an Interface 'Shape' with undefined methods
    //as calculateArea and calculatePerimeter. Create 2
    //classes Circle & Square that implements functionality
    //defined in the Shape Interface. Test your code.
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea();
        circle.calculatePerimeter();
        System.out.println("*******************************");
        Square square = new Square();
        square.calculateArea();
        square.calculatePerimeter();}}

interface Shape{
    void calculateArea();
    void calculatePerimeter();}
class Circle implements Shape{
    @Override
    public void calculateArea() {
        double radius = 7;
        double area=radius*radius*Math.PI;
        System.out.println("The area of the circle is radius ="+radius+" = "+area);}

    @Override
    public void calculatePerimeter() {
        double radius=7;
        double perimeter=radius*Math.PI;
        System.out.println("The perimeter of the circle is : "+perimeter);}}
class Square implements Shape{
    @Override
    public void calculateArea() {
        int s=7;
        int squareArea=s*s;
        System.out.println("The area of the square is "+squareArea);}
    @Override
    public void calculatePerimeter() {
        int side=5;
        int squarePerimeter = 4*side;
        System.out.println("The perimeter of the square is "+squarePerimeter);}}

