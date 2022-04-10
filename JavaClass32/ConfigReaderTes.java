package JavaClass32;

import util.ConfigReader;

import java.io.IOException;

public class ConfigReaderTes {
    public static void main(String[] args) throws IOException {
        System.out.println(ConfigReader.getProperty("URL"));
        System.out.println(ConfigReader.getProperty("password"));

    }
}
