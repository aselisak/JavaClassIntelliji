package Review9;

public class Doctor {
    // instance variables - declares inside the class but outside of any method, constructor or block.
    public String name;
    protected String lName;
    String speciality;
    private double salary;

    static String hospital = "George Washington";

    //static methods can access only static variables
    protected  void work() {
        System.out.println("All doctors work at " + hospital);
    }
public Doctor(String name, String lName){
        this.name=name;
        this.lName=lName;
}
//we can have multiple constructors by overloading them
   public Doctor(String name, String lName, String speciality){
        this(name,lName);
        this.speciality=speciality;
    }
    //static method cannot access non-static members.
    //void printInfo(){ System.out.println("Doctor "+name+" "+lName+" is a  "+speciality);}

    //non-static methods can access static members
    public void printInfo() {
        hello();
        System.out.println("Doctor " + name + " " + lName + " is a  " + speciality+" at "+hospital);
    }
    void hello(){
        System.out.println("hello");
    }
    private void getPaid(){
        System.out.println("Doctor "+name+" "+lName+" gets paid "+salary);
    }

    public static void main(String[] args) {
         Doctor doc = new Doctor("John","Smith","ENT");
         doc.printInfo();
        Doctor doc1 = new Doctor("Jane", "Smith");
        doc1.printInfo();
        //changing the value of instance variable
        doc1.speciality="Dermatologist";
        doc1.printInfo();
        doc.printInfo();
        //static variable chould access in static way -> by class name whe the variable is defined
        Doctor.hospital="Inova";
        doc.printInfo();
        doc1.printInfo();
        System.out.println("-----------------------------");
        doc1.hospital="Best Hospital";
        doc1.printInfo();
        doc.printInfo();
        doc.hello();
    }
}