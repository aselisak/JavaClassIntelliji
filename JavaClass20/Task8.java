package JavaClass20;

public class Task8 {
    //Write program to inherit class A that has method printF
    // which is static and call or reuse that method into class B
    public static void main(String[] args) {
        AA.BB.printF();
    }
}
class AA {
    static void printF(){
        System.out.println("Batch 12 will be making memes on jobs");
    }

    class BB extends AA {

    }
}