package JavaClass24Polymorphizm;

public abstract class Phone {//we divide the task
    void makePhoneCall(){
        System.out.println("Making a phone call");
    }

    void sendText(){
        System.out.println("Sending a text");
    }
    abstract void displayPicture();
    abstract void unlockPhone();
}
  class Iphone extends Phone{
      @Override
      void displayPicture() {
          System.out.println("Use photo app to display the pics");
      }
      @Override
      void unlockPhone(){
          System.out.println("Use the faceID Unlock to open this phone");
      }
  }
  class Samsung extends Phone{
    void displayPicture(){
        System.out.println("Use gallery to display pics");
    }
    @Override
   void unlockPhone(){
       System.out.println("Can use face unlock and display finger print to unlock the phone");
   }
  }