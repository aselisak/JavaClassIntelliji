package JavaProjectGroup17;

public class Task4 {
    /*Create Registration Class in which you would have variables as email, userName and password that
      have an access scope only within its own class. After creating an object of the class user should be able to
      call methods and in each method separately pass values to set users email, username and password.
      Requirements: A.Valid email consider to be only yahoo B.Valid userName and password cannot be empty and
      should be of length larger than 6 characters. Also valid password cannot contain userName*/
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("sdet@yahoo.com");
        registration.userName("Tester123");
        registration.setPassword("123654tester");

    }
}
class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
            System.out.println(email);
        } else { System.out.println("enter valid email address");}}

    public void userName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
        } else {System.out.println("Username cannot be empty or less than 6 characters");}}

    public void setPassword(String password){
        if (!password.isEmpty() && password.length()>6){
            this.password=password;
        }else {System.out.println("Password cannot be empty or less than 6 characters");}}
    }



