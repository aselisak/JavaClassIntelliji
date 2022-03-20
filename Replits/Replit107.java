package Replits;
public class Replit107 {

    public static void main(String[] args) {
        //How would you reverse a String using StringBuffer Class
        //Given String = "Hello Friends"
        //Expected Output:
        //sdneirF olleH

     String str = "Hello friends";
     StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

    }
}
