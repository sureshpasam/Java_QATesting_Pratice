package SeleniumPratice2023;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ReadWriteExcelSelenium {
    WebDriver driver;
    String url = "http://demo.guru99.com/test/newtours/register.php";

    ReadWriteExcelSelenium() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("start-maximized");
        options.setHeadless(false);// headless browser
        // Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/Users/sures/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        driver = new ChromeDriver(options);
    }

    public void navigate(String s) {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Successfully navigate to url");
    }

    public void close() {
        driver.quit();
        System.out.println("Successfully close the browser");

    }


    public static void readExcel(String filePath, String fileName, String sheetName) throws IOException, FileNotFoundException {
        try {
            //Create an object of File class to open xlsx file
            File filepa = new File(filePath + "//" + fileName);
            //Create an object of FileInputStream class to read excel file
            FileInputStream file = new FileInputStream(filepa);
            //Find the file extension by splitting file name in substring  and getting only extension name
            String file_Extension = fileName.substring(fileName.indexOf("."));
            //Check condition if the file is xlsx file
            if (file_Extension.equals(".xls")) {
                //If it is xls file then create object of HSSFWorkbook class
                Workbook workbook = new HSSFWorkbook(file);
                //Read sheet inside the workbook by its name
                Sheet sheet = workbook.getSheet(sheetName);
                //Find number of rows in excel file
                int row_co = sheet.getLastRowNum() - sheet.getFirstRowNum();

                //Create a loop over all the rows of excel file to read it
                for (int i = 0; i < row_co + 1; i++) {

                    Row ro = sheet.getRow(i);
                    //Create a loop to print cell values in a row
                    for (int j = 0; j < ro.getLastCellNum(); j++) {
                        //Print Excel data in console
                        //Print Excel data in console
                        System.out.print(ro.getCell(j).getStringCellValue() + " || ");
                    }
                    System.out.println();
                }
                System.out.println("Successfull read the excel data for xls extension file");

            } else {
                System.out.println("Successfull read the excel data for xlsx extension file");
            }

        } finally {
            System.out.println("Final block is executed");

        }

    }


    public static void main(String[] args) throws IOException {
        try {
            //ReadWriteExcelSelenium r = new ReadWriteExcelSelenium();
            String filepath = System.getProperty("user.dir");
            readExcel(filepath, "testdata/NameAdress.xls", "Details");
            // r.navigate();
            //r.close();
        } catch (Exception e) {
            System.out.println("Expection is " + e.getMessage());
        }

    }


}

/*
xls class      Interfaces    Xlsx class

HSSFWorkbook    Workbook    XSSFWorkbook
HSSFSheet        Sheet      XSSFSheet
HSSFRow         Row         XSSFRow
HSSFCell        Cell        XSSFCell

Workbook: XSSFWorkbook and HSSFWorkbook classes implement this interface.
XSSFWorkbook: Is a class representation of XLSX file.
HSSFWorkbook: Is a class representation of XLS file.
Sheet: XSSFSheet and HSSFSheet classes implement this interface.
XSSFSheet: Is a class representing a sheet in an XLSX file.
HSSFSheet: Is a class representing a sheet in an XLS file.
Row: XSSFRow and HSSFRow classes implement this interface.
XSSFRow: Is a class representing a row in the sheet of XLSX file.
HSSFRow: Is a class representing a row in the sheet of XLS file.
Cell: XSSFCell and HSSFCell classes implement this interface.
XSSFCell: Is a class representing a cell in a row of XLSX file.
HSSFCell: Is a class representing a cell in a row of XLS file.

Steps for reading the excel sheet:

//Create an object of File class to open xlsx file
//Create an object of FileInputStream class to read excel fileFileInputStream file = new FileInputStream(filepa);
//Find the file extension by splitting file name in substring  and getting only extension name
String file_Extension = fileName.substring(fileName.indexOf("."));
//Check condition if the file is xlsx file
//If it is xls file then create object of HSSFWorkbook class
Workbook workbook = new HSSFWorkbook(file);
//Read sheet inside the workbook by its name
Sheet sheet = workbook.getSheet(sheetName);
//Find number of rows in excel file
int row_co = sheet.getLastRowNum() - sheet.getFirstRowNum();
//Create a loop over all the rows of excel file to read it
for (int i = 0; i < row_co + 1; i++) { // it read header also - dont read header int i =1
Row ro = sheet.getRow(i);
//Create a loop to print cell values in a row
for (int j = 0; j < ro.getLastCellNum(); j++) {
//Print Excel data in console
System.out.print(ro.getCell(j).getStringCellValue() + " || ");

//Print Excel data in console
    public static void main(String[] args) throws IOException {
        try {
            String filepath = System.getProperty("user.dir");
            readExcel(filepath, "testdata/NameAdress.xls", "Details");
        } catch (Exception e) {
            System.out.println("Expection is " + e.getMessage());
        }

    }


}
Workbook Methods:
 workbook.getSheet(sheetName);// returns the sheet name
                workbook.getNumberOfSheets();// returns count of the sheet names in the workbook
                workbook.getSheetName(1);// return the sheet name - String
                workbook.getSheetAt(1); // Returns the sheet Name
                workbook.write();// write pass object paramter for outputstream
                workbook.addOlePackage();
                workbook.addPicture();
                workbook.addToolPack();
                workbook.close();
                workbook.cloneSheet(1);
                workbook.createCellStyle();
                workbook.createDataFormat();
                workbook.createFont();
                workbook.createName();
                workbook.createSheet();
                workbook.findFont();
                workbook.createSheet("");
                workbook.getActiveSheetIndex();
                workbook.getAllNames();
                workbook.getAllPictures();
                workbook.getCellStyleAt(0);
                workbook.getCreationHelper();
                workbook.getFirstVisibleTab();
                workbook.getForceFormulaRecalculation();
                workbook.sheetIterator();



// Sheet object Methods

  sheet.getFirstRowNum();
                sheet.getLastRowNum();
                sheet.getRow();
                sheet.getSheetName();
                sheet.addMergedRegion();
                sheet.addValidationData();
                sheet.autoSizeColumn();
                sheet.createFreezePane();
                sheet.createRow();
                sheet.getActiveCell();
                sheet.getCellComments();
                sheet.getColumnBreaks();
                sheet.getColumnStyle();
                sheet.getDefaultColumnWidth();
                sheet.getDataValidations();
                sheet.getDataValidationHelper();
                sheet.getFooter();
                sheet.getHeader();
                sheet.getHyperlinkList();
                sheet.getHyperlink();
                sheet.getTopRow();
                sheet.getWorkbook();
                sheet.isColumnBroken();
                sheet.isSelected();
                sheet.getRowBreaks();
                sheet.setRowBreak();


 // Row object methods

  ro.getCell(0);
                    ro.getLastCellNum();
                    ro.cellIterator();
                    ro.getSheet();
                    ro.createCell(0);
                    ro.getFirstCellNum();
                    ro.getHeight();
                    ro.getPhysicalNumberOfCells();
                    ro.getRowNum();
                    ro.getRowStyle();
                    ro.isFormatted();
                    ro.removeCell();
                    ro.setHeight();
                    ro.shiftCellsLeft();;
                    ro.shiftCellsRight();
                    ro.getRowStyle()
// Get the Cell MEthods

 ro.getCell(j).getStringCellValue();
                        ro.getCell(j).getRow();
                        ro.getCell(j).getSheet();
                        ro.getCell(j).getAddress();
                        ro.getCell(j).getArrayFormulaRange();
                        ro.getCell(j).getBooleanCellValue();
                        ro.getCell(j).getCachedFormulaResultType();
                        ro.getCell(j).getCellComment();
                        ro.getCell(j).getCellFormula();
                        ro.getCell(j).getCellStyle();
                        ro.getCell(j).getCellType();
                        ro.getCell(j).getColumnIndex();
                        ro.getCell(j).getDateCellValue();
                        ro.getCell(j).getErrorCellValue();
                        ro.getCell(j).getHyperlink();
                        ro.getCell(j).getLocalDateTimeCellValue();
                        ro.getCell(j).getNumericCellValue();
                        ro.getCell(j).getRichStringCellValue();
                        ro.getCell(j).removeCellComment();
                        ro.getCell(j).removeFormula();
                        ro.getCell(j).removeHyperlink();
                        ro.getCell(j).setAsActiveCell();
                        ro.getCell(j).setCellStyle();
                        ro.getCell(j).setCellValue();// Date parameter
                        ro.getCell(j).setCellValue();//Double
                        ro.getCell(j).setCellValue();// String
                        ro.getCell(j).setCellValue();//Boolean
                        ro.getCell(j).setCellValue();//calendar
                        ro.getCell(j).setCellValue();//local date
                        ro.getCell(j).setCellValue();//Local Date and TIme
                        ro.getCell(j).setCellValue();//RichTextSting
                        ro.getCell(j).setHyperlink();//Parameter Hyperlink

 */
