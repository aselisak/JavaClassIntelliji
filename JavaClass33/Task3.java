package JavaClass33;

public class Task3 {
    //Create a method to check age eligibility that will
    //throw a runtime exception.
    //Method should throw an exception age is less than 16.
    int age;
    public void AgeCheck(int age) throws AgeEligibility{
        if(age<16){
            throw new AgeEligibility("age is less than 16");
        }else{
            this.age=age;
        }
    }
    public static void main(String[] args) {
        Task3 exception = new Task3();
        try {
            exception.AgeCheck(15);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
