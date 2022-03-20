package Replits132;

public class Repl135 {

    static String surround(String s, String search_team) {
        s = s.replaceAll(search_team, "(" + search_team + ")");
        return s;
    }
    public static void main(String[] args) {
        System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
    }
}


