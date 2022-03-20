package Replits132;

public class Repl136 {
    private void m1(){
        System.out.println("this is private method");
    }
    void m2(){
        System.out.println("this is default method");
    }
    protected void m3(){
        System.out.println("this is protected method");
    }
    public void m4(){
        System.out.println("this is public method");
    }

    public static void main(String[] args) {
        Repl136 modifiers = new Repl136();
         modifiers.m1();
         modifiers.m2();
         modifiers.m3();
         modifiers.m4();

    }
}

