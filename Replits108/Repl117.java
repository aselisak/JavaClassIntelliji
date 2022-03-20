package Replits108;

public class Repl117 {
    int sumEvenTox(int x){
        int sum=0;
        for (int i=0; i<=x; i+=2)
            sum+=i;
            return sum;

    }

    public static void main(String[] args) {
        Repl117 obj = new Repl117();
        System.out.println(obj.sumEvenTox(5));

    }
}
