package SeleniumPratice2023;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class ReadWriteExcelUpdatedPassFailInExcel {
    WebDriver driver;
    String url = "https://demoqa.com/automation-practice-form";


    public void browserLaunch() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("start-maximized");
        options.setHeadless(false);// headless browser
        // Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/Users/sures/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom = '65%'");

    }

    public void ExcelRead(String filePath, String fileName, String sheetName) throws FileNotFoundException, IOException {
        try {


            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            File file = new File(filePath + "//" + fileName);
            FileInputStream fileInputStream = new FileInputStream(file);
            String fileExtension = fileName.substring(fileName.indexOf("."));
            // if (fileExtension.equals(".xls")) {
            Workbook workbook = new HSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheet(sheetName);
            int no_of_Rows = sheet.getLastRowNum() - sheet.getFirstRowNum();
            for (int i = 1; i < no_of_Rows; ) {
                WebElement firstName = driver.findElement(By.id("firstName"));
                WebElement lastName = driver.findElement(By.id("lastName"));
                WebElement email = driver.findElement(By.id("userEmail"));
                WebElement genderMale = driver.findElement(By.id("gender-radio-1"));
                WebElement mobile = driver.findElement(By.id("userNumber"));
                WebElement address = driver.findElement(By.id("currentAddress"));
                WebElement submitBtn = driver.findElement(By.id("submit"));

                firstName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
                lastName.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
                email.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
                //mobile.sendKeys((sheet.getRow(i).getCell(4).toString()));
                mobile.sendKeys("9703533394");
                address.sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", genderMale);
                submitBtn.click();
                WebElement confirmationMessage = driver.findElement(By.xpath("//div[text()='Thanks for submitting the form']"));
                Cell cell = sheet.getRow(i).createCell(6);
                if (confirmationMessage.isDisplayed()) {
                    // if the message is displayed , write PASS in the excel sheet
                    cell.setCellValue("PASS");
                    System.out.println("Scenario is Passed");
                    // Write the data back in the Excel file
                    FileOutputStream outputStream = new FileOutputStream(file);
                    workbook.write(outputStream);

                    //close the confirmation popup
                    WebElement closebtn = driver.findElement(By.id("closeLargeModal"));
                    closebtn.click();

                    //wait for page to come back to registration page after close button is clicked
                    // driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
                    break;
                } else {
                    //if the message is not displayed , write FAIL in the excel sheet
                    cell.setCellValue("FAIL");
                    System.out.println("Scenario is Failed");
                }


                i++;
            }


            //}
        } catch (Exception e) {
            System.out.println("Exception is ::" + e.getMessage());
        }
        //workbook.close();
    }

    public void navigate() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
        System.out.println("Successfully navigate to url");
    }

    public void close() {
        driver.quit();
        System.out.println("Successfully the close browser");
    }

    public static void main(String[] args) throws IOException, NullPointerException {
        ReadWriteExcelUpdatedPassFailInExcel r = new ReadWriteExcelUpdatedPassFailInExcel();
        String filePath = System.getProperty("user.dir");
        r.browserLaunch();
        r.navigate();
        r.ExcelRead(filePath, "testdata/Resform.xls", "Res");
        r.close();
    }
}
