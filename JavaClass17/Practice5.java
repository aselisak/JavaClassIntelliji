package JavaClass17;

import java.util.Locale;

public class Practice5 {
    String weekDay(String day) {
        day = day.toLowerCase(Locale.ROOT);
        switch (day) {
            case "monday":
                return "It is lazy day";
            case "tuesday":
                return " It is productive day";
            case "wednesday":
                return "It is a gloomy day";
            case "thursday":
                return "It is exciting day";
            case "friday":
                return "No work day";
            default:
                return "No correct option found";


        }
    }

    public static void main(String[] args) {
        Practice5 p = new Practice5();
        p.weekDay("friday");
    }
}
