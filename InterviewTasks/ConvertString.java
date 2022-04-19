package InterviewTasks;

import java.util.Scanner;

public class ConvertString {
    //convert String
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s =scan.next();
        String reverseStr="";
        for (int i=s.length()-1;i>=0; i--){
            reverseStr+=s.charAt(i);
        }
        System.out.println(reverseStr);
        scan.close();
    }
}