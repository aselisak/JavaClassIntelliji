package Replits108;

public class Repl131 {

    static String thirdLetter(String s){
        String newString="";
        for (int i=0; i<s.length(); i+=3){
            newString+=s.charAt(i);
        }return newString;
    }


    public static void main(String[] args) {
        System.out.println(thirdLetter("hello there"));
        System.out.println(thirdLetter("technology"));
    }
}
