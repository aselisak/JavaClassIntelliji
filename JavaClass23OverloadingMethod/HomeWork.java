package JavaClass23OverloadingMethod;

class Student{
    void learn(){ System.out.println("solve the Replits 1");}
    void homeTask() { System.out.println("Everybody need to do homework");}
    void projects(){ System.out.println("Student does the projects");}
}
class SyntaxStudent extends Student {
    void learn() { System.out.println("solve the replits 2");}
    void homeTask(){ System.out.println("need to practice Java");}
    void projects(){ System.out.println("Group projects every month");}
    }

class CollegeStudent extends Student {
    @Override
    void learn() {System.out.println("solve the replits 3");}
    void homeTask(){ System.out.println("Participation in class");}
    void projects(){ System.out.println("Group projects every month");}
    }

class SchoolStudent extends Student {
    @Override
    void learn() {System.out.println("solve the quizes");}
    void homeTask(){ System.out.println("Participation in class");}
    void projects(){ System.out.println("Group projects every month");}
}
public class HomeWork {
//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
//Define common behavior within parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism
public static void main(String[] args) {
              SchoolStudent schoolStudent = new SchoolStudent();
              schoolStudent.learn();
              CollegeStudent collegeStudent = new CollegeStudent();
              collegeStudent.homeTask();
              SyntaxStudent syntaxStudent = new SyntaxStudent();
              syntaxStudent.projects();
    System.out.println("*****************************");
    Student student=new SyntaxStudent();
    student.homeTask();
    Student student1 = new SyntaxStudent();
    student1.learn();



}
}