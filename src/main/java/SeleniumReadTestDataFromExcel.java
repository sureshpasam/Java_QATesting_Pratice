package RestAssured_Pratice.RestApi;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;





public class SeleniumReadTestDataFromExcel {

	public void readExcel(String filePath,String sheetName) throws IOException{

	    //Create an object of File class to open xlsx file

	    File file =    new File(filePath);

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook guru99Workbook = null;

	    //Find the file extension by splitting file name in substring  and getting only extension name

	    String fileExtensionName = filePath.substring(filePath.indexOf("."));
	    //Check condition if the file is xlsx file

	    if(fileExtensionName.equals(".xlsx")){

	    //If it is xlsx file then create object of XSSFWorkbook class

	    //guru99Workbook = new XSSFWorkbook(inputStream);
	    

	    }

	    //Check condition if the file is xls file

	    else if(fileExtensionName.equals(".xls")){

	        //If it is xls file then create object of XSSFWorkbook class

	        guru99Workbook = new HSSFWorkbook(inputStream);

	    }

	    //Read sheet inside the workbook by its name

	    //Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);
	    for (int i=0;i<guru99Workbook.getNumberOfSheets();i++) {
	    	//System.out.println(guru99Workbook.getSheetName(i));
	    	String sN = guru99Workbook.getSheetName(i);
	    	
	    	 Sheet guru99Sheet = guru99Workbook.getSheet(sN);

	 	    //Find number of rows in excel file

	 	    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

	 	    //Create a loop over all the rows of excel file to read it

	 	    for (int ii = 0; ii < rowCount+1; ii++) {

	 	        Row row = guru99Sheet.getRow(ii);
	 	       
	 	   

	 	        //Create a loop to print cell values in a row

	 	        for (int j = 0; j < row.getLastCellNum(); j++) {

	 	            //Print Excel data in console

	 	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	 	        }

	 	        System.out.println();
	 	    } 

	 	    }  
	    }
	    
	   

	    //Main function is calling readExcel function to read data from excel file

	    public static void main(String...strings) throws IOException{

	    //Create an object of ReadGuru99ExcelFile class

	    	SeleniumReadTestDataFromExcel objExcelFile = new SeleniumReadTestDataFromExcel();

	    //Prepare the path of excel file

	    String filePath = "C:\\Users\\Nisum\\Desktop\\testuserr.xls";

	    //Call read file method of the class to read data

	    objExcelFile.readExcel(filePath,"Selenium_TestData");

	    }
}