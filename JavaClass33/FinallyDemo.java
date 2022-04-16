package JavaClass33;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyDemo {
    public static void main(String[] args) throws IOException {
      /*  String path="/Users/macos10/Desktop/Config.Properties/Book2.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);//reading the file
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet =xssfWorkbook.getSheet("Sheet1");
        fileInputStream.close();
        System.out.println("Now you should be able to perform other operations");*/

        FileInputStream fileInputStream1=null;
        try {
            String path ="/Users/macos10/Desktop/Config.Properties/Book2.xlsx";
            fileInputStream1=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream1);
            Sheet sheet =xssfWorkbook.getSheet("Sheet1");
        }
        catch(FileNotFoundException exception){
            System.out.println("The File that you are trying to read is not present" +
                    " on provided path please check your path again");
        }catch (IOException ioException){
            System.out.println("Something with hard drive went wrong");
        }finally {
            try {
                fileInputStream1.close();
            } catch (IOException e) {
                System.out.println(" error while closing the file");
            }
        }

        System.out.println("Now you should be able to perform other operations");
    }
}






