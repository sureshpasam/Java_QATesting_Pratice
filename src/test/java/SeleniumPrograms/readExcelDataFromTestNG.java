package SeleniumPrograms;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

public class readExcelDataFromTestNG {
    WebDriver driver;
    String url ="https://emicalculator.site/";

    @DataProvider(name = "data")
    public Object[][] testDataSupplier() throws Exception{

        //file path where excel file placed, containing test data.
        String filePath = "C:\\Users\\sures\\Desktop\\loan.xls";

        //read excel file using file input stream, using Apache POI
        FileInputStream fis = new FileInputStream(new File(filePath));

        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sheet = wb.getSheet("sheet1");

        //calculate total number of rows and columns so that we can iterate over it.
        int totalNumberOfRows = sheet.getLastRowNum()+1;
        int totalNumberOfCols = sheet.getRow(0).getLastCellNum();

        //create an object array. which will store the test data from excel file
        Object[][] testdata1 = new Object[totalNumberOfRows][totalNumberOfCols];


        for (int i = 0; i <totalNumberOfRows; i++ ){
            for (int j = 0; j < totalNumberOfCols; j++){

                testdata1[i][j] =  sheet.getRow(i).getCell(j).toString();
            }
        }
        return testdata1;
    }



    @BeforeTest()
    public void testSetUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("start-maximized");
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver = new ChromeDriver(options);
    }


    @Test(dataProvider = "data")
    public void DataDrivenTest1(String LoanAmount, String InterestRate, String Tenure){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
        System.out.println("With out priority set the this method");
        driver.findElement(By.xpath("//*[@id='frm-emi']/p[1]/input")).sendKeys(LoanAmount);
        driver.findElement(By.xpath("//*[@id='frm-emi']/p[2]/input")).sendKeys(InterestRate);
        driver.findElement(By.xpath("//*[@id='frm-emi']/div/div/input")).sendKeys(Tenure);
        driver.findElement(By.xpath("//*[@id='frm-emi']/p[3]/input")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @AfterTest()
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }

}
