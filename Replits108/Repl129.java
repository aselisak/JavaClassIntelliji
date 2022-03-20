package Replits108;

public class Repl129 {
    static String country;
    static String continent;
    void display(){
        System.out.println(country+" "+continent);
    }

    public static void main(String[] args) {
        country = "Tunis";
        continent = "Africa";
        Repl129 o = new Repl129();
        o.display();
    }
}
