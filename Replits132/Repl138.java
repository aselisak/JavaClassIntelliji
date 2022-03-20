package Replits132;

public class Repl138 {
    public static void main(String[] args) {
        AnotherClass obj = new AnotherClass();
        obj.m2();
        obj.m3();
        obj.m4();
        //obj.m1();
    }
}
class AnotherClass{
    private void m1(){
        System.out.println("private");
    }
    void m2(){
        System.out.println("default");
    }
    protected void m3(){
        System.out.println("protected");
    }
    public void m4(){
        System.out.println("public");
    }
}