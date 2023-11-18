package SeleniumPratice2023;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public void write(String filePath, String fileName, String sheetName, String[] dataToWrite) throws IOException {
        ////Create an object of File class to open xlsx file
        File file = new File(filePath + "\\" + fileName);
        //Create an object of FileInputStream class to read excel file
        FileInputStream fileInputStream = new FileInputStream(file);
        //check the file extension
        String Extension = fileName.substring(fileName.indexOf("."));
        if (Extension.equals(".xls")) {
            //If it is xlsx file then create object of XSSFWorkbook class
            Workbook book = new HSSFWorkbook(fileInputStream);
            //Read excel sheet by sheet name
            Sheet sheet = book.getSheet(sheetName);
            //get the no of rows
            int Row_Count = sheet.getLastRowNum() - sheet.getFirstRowNum();
            //Get the first row from the sheet
            Row ro = sheet.getRow(0);
            //Create a new row and append it at last of sheet
            Row new_row = sheet.createRow(Row_Count + 1);
            //Create a loop over the cell of newly created Row

            Row rooo = sheet.getRow(4);
            System.out.println("specific cell value "+rooo.getCell(1).getStringCellValue());
            for (int j = 0; j < ro.getLastCellNum(); j++) {
                Cell cell = new_row.createCell(j);
                cell.setCellValue(dataToWrite[j]);
            }
            //Close input stream
            fileInputStream.close();
            //Create an object of FileOutputStream class to create write data in excel file
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            //write data in the excel file
            book.write(fileOutputStream);
            //close output stream
            fileOutputStream.close();
            System.out.println("Successfully write the excel data in the sheet");

        } else {

        }
    }

    public static void main(String[] args) throws IOException {
        WriteExcel writeExcel = new WriteExcel();
        String[] valueToWrite = {"MR suresh Pasam", "Noida"};
        String filepath = System.getProperty("user.dir");
        writeExcel.write(filepath, "testdata/NameAdress.xls", "Details", valueToWrite);
    }

}

/*
1. create instance for file - read the path of the file
2. create instance for FileInputStream  - read the excel file
3. check file extension - weither its xls and .xlsx
4. create instance of work - Workbook wk = new HSSFworkbook(pass paramter fileinput stream);
5. create instance of sheet - get the sheet name = Sheet sh = book.getSheet(pass the parameter sheet name)
6. get the no of rows int count = sheet.getLastRowNum()-sheet.getFirstRowNum();
7. Row row =sheet.getRow(0)-- get the first row num
8. create NNew row = sheet.CreateRow(count+1)
9. for int j =0;j<row.getLastCellNUm();j++)
{
Cell c = newRow.createCell(j);
c.setCellValue(String arry object);

}
close the file input stream

10. create an object for the FileOutputStream -- pass the pathe file

11.workvook.write(outputstremm object)
outputstream.close()


// Read the specific cell value

 File file = new File(filePath + "\\" + fileName);
        //Create an object of FileInputStream class to read excel file
        FileInputStream fileInputStream = new FileInputStream(file);
        //check the file extension
        String Extension = fileName.substring(fileName.indexOf("."));
        if (Extension.equals(".xls")) {
            //If it is xlsx file then create object of XSSFWorkbook class
            Workbook book = new HSSFWorkbook(fileInputStream);
            //Read excel sheet by sheet name
            Sheet sheet = book.getSheet(sheetName);
            Row rooo = sheet.getRow(4);
            System.out.println("specific cell value "+rooo.getCell(1).getStringCellValue());


 */
