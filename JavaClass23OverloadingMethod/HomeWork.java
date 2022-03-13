package JavaClass23OverloadingMethod;

class Student {
    void study () {
        System.out.println("Students must study to pass");
    }
    void doHomeWork () {
        System.out.println("Students must do HW");
    }
    void practice () {
        System.out.println("Students must to practice");
    }
}
class SyntaxStudent extends Student{
    void study () {
        System.out.println("Syntax students must study 25 hours a week");
    }
    void  doHomeWork () {
        System.out.println("Syntax students must solve repls");
    }
    @Override
    void practice () {
        System.out.println("Syntax students must do their own research");
    }
}

class CollegeStudent extends Student {
    @Override
    void doHomeWork () {
        System.out.println("College students can skip some of the homeWork");
    }
}
class SchoolStudent extends Student {

}


public class HomeWork {
//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
//Define common behavior within parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism
public static void main(String[] args) {

//as we can store the object of a child class in a parent class we can also create an array of these students as show below
        Student syntaxStudent = new SyntaxStudent();
        Student schoolStudent = new SchoolStudent();

              Student [] students = {new SyntaxStudent(),new SchoolStudent(), new CollegeStudent()};
             for (Student student : students){//calling methods from all the children classes
                 student.study();
                 student.doHomeWork();
                 student.practice();
             }
}
}