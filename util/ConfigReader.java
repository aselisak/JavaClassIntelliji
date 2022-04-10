package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String getProperty(String key) throws IOException {

            //first step locating the file that we to read
            String path="files/Config.properties";
            //navigating to that location
            FileInputStream fileInputStream = new FileInputStream(path);
            //That special class which know how to read properties files
            Properties properties = new Properties();
            //loading all the data from the file to properties object
            properties.load(fileInputStream);
            return  properties.getProperty(key);

        }
}
