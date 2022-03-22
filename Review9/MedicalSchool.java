package Review9;

public class MedicalSchool {
    public static void main(String[] args) {

        Doctor doc = new Doctor("Asel", "Kiyatova", "Dermatalogist");
        doc.printInfo();
        doc.hello();
        doc.work();
        //doc.getPaid(); private method is not available in different classes
        System.out.println(doc.name);
        System.out.println(doc.lName);
        System.out.println(doc.speciality);
        //System.out.println(doc.salary); private variable is not available in different classes
    }

}