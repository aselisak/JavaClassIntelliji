package com.syntax.class17;

public class Task5 {

	public static void main(String[] args) {

        // TODO Auto-generated method stub
        Task5 task = new Task5();
        System.out.println(task.isPalindrome("aba"));


    }

    boolean isPalindrome(String inputStr) {
        String reversedStr = reverseString(inputStr);
        return reversedStr.equals(inputStr);
    }

    String reverseString(String inputString) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        return stringBuilder.reverse().toString();
    }

}
