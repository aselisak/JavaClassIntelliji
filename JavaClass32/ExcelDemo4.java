package JavaClass32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo4 {
    public static void main(String[] args) throws IOException {
        String path="/Users/macos10/Desktop/Config.Properties/Dmitry.xlsx";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        Sheet sheet =xssfWorkbook.createSheet("Sheet1");
        Row row = sheet.createRow(0);
       Cell cell= row.createCell(0);
       cell.setCellValue("Ali");
       xssfWorkbook.write(fileOutputStream);//writes the data inside the excel file

    }
}
