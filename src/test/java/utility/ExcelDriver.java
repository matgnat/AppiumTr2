package utility;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by magn on 10/11/2017.
 */
public class ExcelDriver {

    public static void main(String[] args) throws IOException {

        System.out.println(getCellData(2, 5));
        System.out.println(getCellData(8, 8));

    }

    public static String getCellData(int rownum, int cellnum) throws IOException {
        try {
            File f = new File("src");
            File f_data = new File(f, "Test_Data.xlsx");
            FileInputStream file = new FileInputStream(f_data);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet1 = workbook.getSheet("Sheet1");
            XSSFRow row = sheet1.getRow(rownum);
            XSSFCell cell = row.getCell(cellnum);
            return cell.getStringCellValue();
        } catch (NullPointerException e) {
            return ("wystapi wyjatek " + e);
        }



    }
}
