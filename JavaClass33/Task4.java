package JavaClass33;

public class Task4 {
    //Create a method checkUserName that will throw a runtime exception.
    //Method should throw an exception when entered
    //username is less than 5 characters.
    String user;
    public void SetUserName(String user) throws CheckUserName{
        if(user.length()<5){
            throw new CheckUserName("username is less than 5 characters");
        }else{
            this.user=user;
        }
    }
    public static void main(String[] args) {
        Task4 e = new Task4();
        try {
            e.SetUserName("Asel");
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
