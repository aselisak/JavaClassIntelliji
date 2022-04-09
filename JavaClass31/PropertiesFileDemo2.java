package JavaClass31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo2 {
    public static void main(String[] args) throws IOException {
        String path="/Users/macos10/Desktop/Config.Properties/Config.properties";
        FileInputStream fileInputStream = new FileInputStream(path);
        //That special class which know how to read properties files
        Properties properties = new Properties();
        //loading all the data from the file to properties object
        properties.load(fileInputStream);
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));
    }
}
