import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		  FileInputStream file = new FileInputStream(new File("C:\\Users\\Nisum\\Desktop\\testuserr.xls")); 
		  
          // Create Workbook instance holding reference to .xlsx file 
		  HSSFWorkbook workbook = new HSSFWorkbook(file); 

          // Get first/desired sheet from the workbook 
          HSSFSheet sheet = workbook.getSheetAt(0); 

          // Iterate through each rows one by one t
         
          Iterator<Row> rowIterator = sheet.iterator(); 
          while (rowIterator.hasNext()) { 
              Row row = rowIterator.next(); 
              // For each row, iterate through all the columns 
              Iterator<Cell> cellIterator = row.cellIterator() ;

              while (cellIterator.hasNext()) { 
                  Cell cell = cellIterator.next(); 
                  // Check the cell type and format accordingly 
//                  switch (cell.getCellType()) {
//                  case Cell.CELL_TYPE_NUMERIC:
//                      System.out.print(cell.getNumericCellValue() + " ");
//                      break;
//                  case Cell.CELL_TYPE_STRING:
//                      System.out.print(cell.getStringCellValue() + " ");
//                      break;
//                  }
              } 
              System.out.println("  "); 
          } 
          file.close(); 

	}

}
