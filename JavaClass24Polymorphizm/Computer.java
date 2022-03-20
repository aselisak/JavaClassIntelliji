package JavaClass24Polymorphizm;
public class Computer {
    //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    //Define common behavior within and some fields in parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Create objects of child classes and store them into array. Loop through each object and execute available methods.
    void login() {System.out.println("Login to the computer using valid credentials");}
    void open() {System.out.println("Open google chrome browser");}
    public static void main(String[] args) {
        Computer[] computers = {new Apple(), new Lenova(), new HP(), new Dell()};
        for (Computer c : computers) {
            c.login();
            c.open();}}}
class Apple extends Computer{
    @Override
      void login(){System.out.println("Login to mac computer using valid credentials");}
      void AppStore(){System.out.println("Using your Apple ID and Password make a purchase");}
    @Override
      void open(){ System.out.println("Open Safari browser");}}

class Lenova extends Computer{
    @Override
    void login(){System.out.println("Login Lenova computer with valid credentials");}
    void search(){ System.out.println("Search for a document");}}

class HP extends Computer{
    @Override
    void login(){System.out.println("Login to HP computer using valid credentials");}
    @Override
    void open(){
        System.out.println("Open printer application");}}

class Dell extends Computer{
    @Override
    void login(){
        System.out.println("Login Dell computer using valid credentials");}
    @Override
    void open(){System.out.println("Open the Microsoft office");}
    void search(){System.out.println("Open Internet explorer and search for a movie");}}







