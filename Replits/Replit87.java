package Replits;

public class Replit87 {
    //Create a class named 'Main' with specific attributes.
    //Create two objects of that class in which you will be assigning the following values and then print them.
}
class  Main2{
    String carColor;
    int year;
    String carMake;

    void cars(){
        System.out.println("Car color is "+carColor+" and car year is "+year+" and car model is "+carMake);
    }

    public static void main(String[] args) {
        Main2 obj1 = new Main2();
        obj1.carColor="Black";
        obj1.year=2019;
        obj1.carMake="BMW";
        obj1.cars();

        Main2 obj2 = new Main2();
        obj2.carColor="White";
        obj2.year=2018;
        obj2.carMake="Toyota";
        obj2.cars();

    }

}