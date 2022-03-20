package Replits132;

public class Repl139 {
    public static void main(String[] args) {
        System.out.println(alphabetical("hello")); //"hlo"
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));
    }


    public static String alphabetical(String str) {
        String newStr = "" + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) < str.charAt(i)) {
                newStr = newStr + str.charAt(i);
            }
        }
        return newStr;
    }
}
