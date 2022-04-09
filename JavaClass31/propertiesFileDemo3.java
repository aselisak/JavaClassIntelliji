package JavaClass31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesFileDemo3 {
    public static void main(String[] args) throws IOException {
        String path="/Users/macos10/Desktop/Config.Properties/trump.properties";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        Properties properties =new Properties();
        properties.put("IsCrazy","false");
        properties.put("IsRich","true");
        properties.store(fileOutputStream,"Added some new fields");


    }
}
