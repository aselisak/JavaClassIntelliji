package Replits108;

public class Repl119 {
    public static String censorLetter(String a, char b){

        return a.replace(b,'*');
    }

    public static void main(String[] args) {
    Repl119 obj = new Repl119();
        System.out.println(obj.censorLetter("computer science",'e'));
        System.out.println(obj.censorLetter("trick or treat",'t'));

    }
}
