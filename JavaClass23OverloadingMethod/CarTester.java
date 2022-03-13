package JavaClass23OverloadingMethod;

public class CarTester {
    public static void main(String[] args) {


        BMW bmw = new BMW();
        bmw.start();
        Suzuki suzuki = new Suzuki();
        suzuki.start();
        suzuki.stop();
        System.out.println("*********************");
        //  BMW bmw1 = new Car(); not allowed in Java

        Car car = new BMW();
        car.start();
        car = new Tesla();
        car.start();
        car = new Suzuki();
        car.start();
        //Object str = new String("djbfdh");
    }
}