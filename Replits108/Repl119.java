package Replits108;

public class Repl119 {
    String censorLetter(String a, char b){
        a=a.replace("e","*");
        return a;
    }

    public static void main(String[] args) {
    Repl119 obj = new Repl119();
        System.out.println(obj.censorLetter("computer science",'*'));

    }
}
