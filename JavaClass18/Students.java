package JavaClass18;

public class Students {
    String name;
    String id;
    static int numberOfStudents;



    public static void main(String[] args) {


        Students student1 = new Students();
        student1.name="Yazgul";
        student1.id ="123";
        student1.numberOfStudents++;


        Students student2 = new Students();
        student2.name="Yazgul";
        student2.id ="123";
        student2.numberOfStudents++;


        Students student3 = new Students();
        student3.name="Yazgul";
        student3.id ="123";
        student3.numberOfStudents++;
        System.out.println(student3.numberOfStudents);


    }}