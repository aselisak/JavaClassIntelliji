package Replits132;

public class Repl182 {
    public static void main(String[] args) {
        Variables human = new Variables("John","Doe",10,25,1900,"123-45-6789");
        System.out.println(human.getFirstName());
        System.out.println(human.getLastName());
        System.out.println(human.getBirthMonth()+"/"+human.getBirthDay()+"/"+human.getBirthYear());
        System.out.println(human.getSsn());
    }
}
class Variables{
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private String ssn;

    public Variables(String firstName, String lastName, int birthMonth, int birthDay, int birthYear, String ssn) {
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.birthMonth = birthMonth;
        this.birthDay   = birthDay;
        this.birthYear  = birthYear;
        this.ssn        = ssn;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getSsn() {
        return ssn;
    }

}