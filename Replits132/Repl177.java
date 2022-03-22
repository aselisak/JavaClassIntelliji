package Replits132;

public class Repl177 implements Functions{
    public void add(double num1, double num2){System.out.println("Result is ::: "+(num1+num2));}
    @Override
    public void sub(double num1, double num2) { System.out.println("Result is ::: "+(num1-num2));}
    @Override
    public void mult(double num1, double num2) { System.out.println("Result is ::: "+(num1*num2));}
    @Override
    public void div(double num1, double num2) { System.out.println("Result is ::: "+(num1/num2));}
    public void display(double result){
        System.out.println();}

    public static void main(String[] args) {
     Repl177 cal = new Repl177();
     cal.add(100,20);
     cal.sub(100,20);
     cal.mult(100,20);
     cal.div(100,20);
    }
}
interface Outputs{
    void display(double result);}
 interface Functions extends Outputs{
    void add(double num1, double num2);
    void sub(double num1, double num2);
    void mult(double num1, double num2);
    void div(double num1, double num2);
}

