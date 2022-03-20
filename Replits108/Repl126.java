package Replits108;

import org.omg.CORBA.TRANSACTION_MODE;

public class Repl126 {
    static int count;

    public static void main(String[] args) {
        Repl126 obj = new Repl126();
        count++;
        Repl126 obj1 = new Repl126();
        count++;
        Repl126 obj2 = new Repl126();
        count++;
        System.out.println(count);
    }
}
