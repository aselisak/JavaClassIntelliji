package Replits108;

public class Repl130 {

    static void mistery(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] / 2 + " ");
            } else {
                System.out.print(arr[i] * 10 + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        mistery(a);
    }

}
