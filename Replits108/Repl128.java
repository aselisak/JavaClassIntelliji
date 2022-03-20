package Replits108;

public class Repl128 {

    static String mixString (String s1, String s2){
        String returnedString="";
        for (int i=0; i<s1.length(); i++){
            returnedString=returnedString+s1.charAt(i)+s2.charAt(i);
        }
        return returnedString;
    }

    public static void main(String[] args) {
        String firstValue = mixString("12345","abcde");

        System.out.println(firstValue);

    }
}
