package JavaClass33;

public class Task2 {
    //Create a static method that will return a List of Exceptions.
    //Inside your method create objects of 4 exception classes using
    // try and catch blocks and store them inside your list.
    //Call your method inside main and print name and details of all Exception objects.

    static void arithmeticalException(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Thrown when an exceptional arithmetic condition has occurred");
        }
    }

    static void nullPointerException() {
        try {
            String str = null;
            str.length();
        } catch (NullPointerException exception) {
            System.out.println("nullPointerException is occurred");
        }
    }


     static void negativeArraySizeException() {
        try {
            int[] arr = new int[-1];
        } catch (NegativeArraySizeException exception) {
            System.out.println("NegativeArraySizeException is occurred");
        }

    }



    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.arithmeticalException(10,0);
        task2.nullPointerException();
        task2.negativeArraySizeException();

    }




}
