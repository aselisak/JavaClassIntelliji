package Review9_another;

import Review9.Doctor;

public class Hospital {
    public static void main(String[] args) {
      Doctor doc =  new Doctor("Volcan", "Dereli");
      doc.printInfo();//public method is available everywhere
      //doc.work();//protected method not available in different package
      //doc.hello();//default method is not available in different packages
      //doc.getPaid();// private method is not available in different classes

    }
}
