package Replits132;

public class Repl140 {
    
    public static String maxLength(String[] arr){
        int maxString=0;
        String longString = null;
        for (String s : arr){
            if(s.length()>maxString){
                maxString=s.length();
                longString = s;
            }
        }
        return longString;
    }

    public static void main(String[] args) {
        String [] arr ={"hey", "yolo", "hi", "this is long"};
        String longString = maxLength(arr);
        System.out.println(maxLength(arr));
    }
    
}
