package JavaClass32;

import util.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester {
    public static void main(String[] args) throws IOException {
        String path="/Users/macos10/Desktop/Config.Properties/Book2.xlsx";
        List<Map<String,String>> excelData = ExcelReader.getData(path,"Sheet1");
        System.out.println(excelData.get(1).get("Firstname"));
        System.out.println(excelData.get(4).get("Age"));
    }
}
