package JavaClass20;

import java.security.Principal;

public class HumanTester {
    public static void main(String[] args) {
        Student1 student = new Student1();
        student.name="Asel";
        System.out.println(student.name);
        student.printName();
        student.studentId="123";
        System.out.println("******");
        Principle principal = new Principle();
        principal.name="Gulden";
        principal.printName();
        principal.specialParkingSpot="false";



        }


    }

