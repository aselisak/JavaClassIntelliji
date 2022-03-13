package JavaClass22Inheritance;

class UserClass{
    String name;
    String mobile;
    UserClass(String name, String mobile){
        this.name=name;
        this.mobile=mobile;
    }
}
class UserInfo extends UserClass{
    String address;
    UserInfo(String name, String mobile, String address){
        super(name, mobile);
        this.address=address;
    }
    void userDetail(){
        System.out.println("name = "+name+" MobileNumber "+mobile+" Address "+address);
    }
}
public class Task1{
    //Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    // Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    // Print users name, mobile number and address in userDetails method. Test your code.
    public static void main(String[] args) {
        UserInfo userInfo= new UserInfo("Dimitry","123654", "USA");
        userInfo.userDetail();
    }
}