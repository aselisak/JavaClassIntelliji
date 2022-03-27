package JavaClass28;

import java.util.LinkedList;

public class ListDemo4 {
    public static void main(String[] args) {
        Student teyfur = new Student("Teufur",20,"Memes");
        Student gulden = new Student("Flower",16,"Study");
        Student emilia = new Student("Emilia",16,"Coding");

        LinkedList<Student> studentLinkedList=new LinkedList<>();
        studentLinkedList.add(teyfur);
        studentLinkedList.add(gulden);
        studentLinkedList.add(emilia);
        System.out.println(studentLinkedList);
    }
}
class Student {
    String name;
    int age;
    String hobbies;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }

    public Student(String name, int age, String hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;



        }

    }
