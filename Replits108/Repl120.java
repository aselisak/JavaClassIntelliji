package Replits108;

public class Repl120 {
    String name;
    int year;
    int batch;

    void print(){
        System.out.println("I am a student of batch "+batch+" studying at "+name+" in the year of "+year);
    }

    public static void main(String[] args) {
        Repl120 obj = new Repl120();
        obj.name="Syntax";
        obj.year=2022;
        obj.batch=12;
        obj.print();
    }
}
