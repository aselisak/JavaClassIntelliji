package JavaClass17;

public class SyntaxEmployee {
    String empId;
    double salary;
    static  String CEO = "Sumair";


    public static void main(String[] args) {
        SyntaxEmployee aselClass= new SyntaxEmployee();
        aselClass.empId = "123";
        aselClass.salary = 200000;
        System.out.println(aselClass.empId);
        System.out.println(aselClass.salary);
        System.out.println(aselClass.CEO);


        SyntaxEmployee mozzamObj = new SyntaxEmployee();
        mozzamObj.empId="456";
        mozzamObj.salary=19800;
        System.out.println(mozzamObj.empId);
        System.out.println(mozzamObj.salary);
        System.out.println(SyntaxEmployee.CEO);



    }
}
