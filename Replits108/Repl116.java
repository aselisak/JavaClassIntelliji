package Replits108;

public class Repl116 {
    //Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false
    boolean number(int a, int b){
        if (a%2==0 && b%2==0){
            return  true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Repl116 obj = new Repl116();
        System.out.println(obj.number(10,20));
    }
}
