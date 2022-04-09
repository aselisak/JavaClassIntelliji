package JavaClass31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String path ="files/Config.properties";
        //FileInputStream helps us read the dta from file
        FileInputStream fileInputStream = new FileInputStream(path);
//special class that let us read the data from property files
        Properties properties = new Properties();
        //Reading the existing data and storing in the properties class
        properties.load(fileInputStream);
        properties.put("URL","www.google.com");
        ////Creating a file on mentioned path
        FileOutputStream fileOutputStream =new FileOutputStream(path);
        properties.store(fileOutputStream,"added new property URL");

    }
}
