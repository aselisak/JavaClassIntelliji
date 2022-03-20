package Replits108;

public class Repl114 {
    void add(int a, int b){
        int result=a+b;
        System.out.println("Addition "+result);
    }
    void mult(int a, int b){
        int result=a*b;
        System.out.println("Multiplication "+result);
    }
    void sub(int a, int b){
        int result=a-b;
        System.out.println("Subtraction "+result);
    }

    public static void main(String[] args) {
        Repl114 obj = new Repl114();
        obj.add(10,20);
        obj.mult(10,3);
        obj.sub(40,20);

    }
}
