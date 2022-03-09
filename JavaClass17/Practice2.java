package JavaClass17;

public class Practice2 {
    String getRecord(){
        String dep = "QA";
        String empName = "Violet";
        String details = "Worker "+empName+" belongs to "+dep;
        System.out.println(details);
        return details;
    }

    public static void main(String[] args) {
        Practice2 p = new Practice2();

        p.getRecord();


    }
}
