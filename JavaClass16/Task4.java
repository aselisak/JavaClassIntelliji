package JavaClass16;

public class Task4 {
    public static void main(String[] args) {
        String s="Sunday is great";
        //String [] strArray=s.split(" ");
        //for (int i=0; i<strArray.length; i++){
            //System.out.println(strArray[i]);

        Task4 task4 = new Task4();
        //System.out.println(task4.reverse(s));
        String [] strArray =s.split(" ");
        //System.out.println(strArray[0]);
        for (int i=0; i<strArray.length; i++){
            System.out.print(task4.reverse(strArray[i])+" ");
        }
        }


    String reverse(String inputString){
        //converting String to a StringBuilder so that we can use the reverse method
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }




}
