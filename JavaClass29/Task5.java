package JavaClass29;

public class Task5 {
    public static void main(String[] args) {
        /*Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
        Create 3 subclasses Car, Pet, Health. Car class has its own attribute as carModel and Class Pet has petType attribute.
        Create 3 objects of the subclasses and store them in ArrayList. Using for loop/advanced for loop/
         */}}
abstract class  Insurance{
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    public abstract void getQuote();
    public abstract void cancelInsurance();}

class Car extends Insurance{
    String carModel;
    Car(String insuranceName,String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }
    public void getQuote() {  System.out.println("getting quote for a Car"+ carModel+ "from "+insuranceName);}
    public void cancelInsurance() {System.out.println("please cancel my Car insurance"+carModel+ "from "+insuranceName);}

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                '}';
    }
}


class Pet extends Insurance{
    String petType;
    Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType=petType;
    }
    public void getQuote() {System.out.println("getting the quote for the Pet"+petType+ "from "+insuranceName);}
    public void cancelInsurance() {System.out.println("cancel the insurance for the pet"+petType+ "from "+insuranceName);}
}
class Health extends Insurance{
    Health(String insuranceName) {
        super(insuranceName);
    }

    public void getQuote() { System.out.println("Quote for Health"+ "from "+insuranceName);}
    public void cancelInsurance() {System.out.println("cancel Health insurance"+ "from "+insuranceName);}
    }
