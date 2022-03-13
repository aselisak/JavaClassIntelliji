package JavaClass24Polymorphizm;

public  class Parent {
    final String name="Vladlen";
      final  void method(){
          //name ="mr A; can't reassign if a variable is final
        System.out.println("I am a parent");
    }


}
class Child extends Parent{
       //void method()   can't override because it is final method
       // if you put final on parent class you cannot extend the parent class

}