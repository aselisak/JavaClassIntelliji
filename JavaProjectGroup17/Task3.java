package JavaProjectGroup17;

public class Task3 {
    /*Create a Class Car that would have the following fields:   carPrice   and   color   and   method
    calculateSalePrice() which should be returning a price of the car.Create 2 sub classes: Sedan and Truck. The Truck
    class   has   field   as   weight   and   has   its   own implementation   of   calculateSalePrice()   method   in
    which   returned   price   calculated   as   following: if weight>2000 then returned price car should include
    10% discount, otherwise 20% discount. The Sedan class has field as length and also does it
    is  own  implementation   of   calculateSalePrice(): if length of sedan is >20 feet then returned car price
    should include 5% discount, otherwise 10% discount*/
}
abstract class Car{
    double carPrice;
    String color;
   abstract void calculateSalePrice();
}
class Sedan extends Car{
    double sedanLength;
    @Override
    void calculateSalePrice() {
        if (sedanLength>20){ System.out.println((carPrice*5)/100);}
        else { System.out.println((carPrice*10)/100);}}}

class Truck extends Car{
    double truckWeight;
    @Override
    void calculateSalePrice() {
        if(truckWeight>2000){System.out.println((carPrice*10)/100);}
        else {System.out.println((carPrice*20)/100);}}}



