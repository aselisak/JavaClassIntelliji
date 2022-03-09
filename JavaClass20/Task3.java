package JavaClass20;

public class Task3 {
    //Write a java class that have 4 constructors with 4 different access levels of
    // constructors(private,public,default,protected) and create 4 objects of this class:
    // 1 - inside same class; 2 - from outside the class;
    // 3 - from different class inside different package  and observe result.

    private Task3 (){
        System.out.println("private");
    }
           Task3 (double a){
               System.out.println("Default");
           }
    protected Task3(String a){
        System.out.println("Protected");
    }
    public Task3(boolean a){
        System.out.println("public");
    }

    public static void main(String[] args) {

        new Task3();
        new Task3("haha");
        new Task3(10);
        new Task3(false);



    }
}
