package JavaClass24Polymorphizm;

abstract class File{
    abstract void open();
    void edit() {System.out.println("Editing a class");}
    void close(){ System.out.println("closing the file");}
}

class JavaFile extends File{
    @Override
    void open(){ System.out.println("Use inteliji to open Java files");}
}
class WordFile extends File{
    @Override
    void open(){ System.out.println("Use Microsoft Word to open this file");}
}
class PdFile extends File{
    @Override
    void open() { System.out.println("Use Adobe Reader to open the file");}
}
public class Task2 {
    //Create a class File that will have the following behaviors: open, edit, close.
    // Edit and close are implemented method while open is an abstract.
    // Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    // Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
    public static void main(String[] args) {
      File [] files={new JavaFile(), new WordFile(), new PdFile(), new PdFile()};//if a method is not present class we
        // can't use that method using polymorphism if the parent is Object
        // for (int i = 0; i<files.length; i++){
           // files[i].open();
            //files[i].edit();
            //files[i].close();
      //   }
         int i=0;
         while(i<files.length){
             files[i].open();
             files[i].edit();
             files[i].close();
             i++;
         }
    }
}