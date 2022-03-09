package JavaClass17;

public class Practice3 {
    String studentName;
    String course;
    int studentId;
    int grades;

    void displayStudentRecord(){
        System.out.println("The student name is "+studentName+ " and the course student enrolled for is "+course);
        System.out.println("Student id is "+ studentId+" and the grades student achieved are "+grades);
    }

    public static void main(String[] args) {
        Practice3 p = new Practice3();
        p.studentName="Rogo";
        p.course="SDET";
        p.studentId=123;
        p.grades=65;
        p.displayStudentRecord();
        System.out.println("-----------------------------");
        Practice3 p2 = new Practice3();
        p2.studentName="Yazina";
        p2.course="science";
        p2.studentId=456;
        p2.grades=91;
        p2.displayStudentRecord();


    }
}
