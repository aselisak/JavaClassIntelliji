package JavaClass32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo6 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/macos10/Desktop/Config.Properties/Book2.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
//A List of Maps to store the data from excel each map will store the data from each row
        List<Map<String,String>> excelData=new ArrayList<>();
//getting the header from excel fil so that we can use the data from this header
// row as keys for the maps like firstname lastname etc
Row headerRow=sheet.getRow(0);
//we write a loop to get all the rows from this sheet except the first row because it contains the headers
        for (int j = 1; j < sheet.getPhysicalNumberOfRows(); j++) {
            //getting all the rows starting from row number 2 skipping the first one because it contains headers
            Row row = sheet.getRow(j);
            //for each row we create a new map so that we don't override the data fo all the rows
            LinkedHashMap <String,String>linkedHashMap =new LinkedHashMap<>();
            //once we have got the row we fetch all the data from all the cells with the help of loop
            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
//we use the header row to get the keys and the row to get the values for the data
                linkedHashMap.put(headerRow.getCell(i).toString(),row.getCell(i).toString());
            }
            //once we are done storing all the data from a row inside a map we put that map inside the list that we created
            excelData.add(linkedHashMap);
        }
        System.out.println(excelData);
    }
}