
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.google.common.base.Function;
import org.testng.util.TimeUtils;


public class Sele {
	 WebDriver driver;

@Test(alwaysRun=true,expectedExceptions= {IOException.class})
public <ErrorInResponseException> void Inistallize() throws IOException, InterruptedException {
	try{
		System.setProperty("webdriver.chrome.driver", "C:/Users/sures/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
	 File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\Users\\Desktop\\emplyee2.png"));
	driver.close();

	// Full lengtht screenshot Java lib

				//Screenshot screenshot = new Ashot().takeScreenshot(driver);
//		Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//		ImageIO.write(s.getImage(),"PNG",new File("<< file path>>"));





//FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

//fwait.until(new Function<WebDriver,WebElement>() {
//	public WebElement apply(WebDriver driver) {
//		WebElement ele = driver.findElement(By.xpath(""));
//		if(ele.getText().equals("")) {
//			System.out.println("fluentWait pass");
//			return ele;
//
//		}else {
//			System.out.println("fluentWait Fail");
//			return null;
//		}
//	}
//});


	 
	 /*JavascriptExecutor javascript = (JavascriptExecutor) driver;
	  javascript.executeScript("alert('Hello World').value('Cancel')");
	  Thread.sleep(2000);
	  driver.switchTo().alert().dismiss();*/
	 
	/* List<WebElement> links = driver.findElements(By.tagName("a"));
	 for(WebElement link:links) {
		 String link_url = link.getAttribute("href");
			HttpUriRequest req = new HttpGet(link_url);
			HttpResponse response =  HttpClientBuilder.create().build().execute(req);
			int code = response.getStatusLine().getStatusCode();
			System.out.println("Status code is::"+code);
		   if(code==200) {
			   System.out.println("valid linkis "+ link_url+":"+code);
		   }else {
			   System.out.println("broken valid linkis "+ link_url+":"+code);
		   }
		    */
		 
		 /*URL u = new URL(link_url);
		 HttpURLConnection c = (HttpURLConnection)u.openConnection();
		 c.connect();
		 int status_code = c.getResponseCode();
		 if(status_code !=200) {
			 System.out.println("broken link"); 
		 } else {
			 System.out.println("valid ink"); 
		 }*/
		// System.out.println("links"+ link_url);
	 }catch (SessionNotCreatedException e) {
		// TODO: handle exception
		 System.out.println(e.getMessage());
	}
}
	 
	  
	 
	  
		
     // implicit wait
    /* driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     WebElement element = driver.findElement(By.id("state"));
     Select sel = new Select(element);
     List<WebElement> list = sel.getAllSelectedOptions();
     List<WebElement> list1  =sel.getOptions();
     for (WebElement li : list) {
    	 
    	 System.out.println("All Values"+li.getText());
     }
     WebElement ele;
    Actions act = new Actions(driver);
    act.contextClick(ele).build().perform();
    
    driver.manage().timeouts().
     //Explicit wait:
     
     WebDriverWait wa = new WebDriverWait(driver, 30);
     wa.until(ExpectedConditions.visibilityOfElementLocated(By.id("LoginButton")));*/

    	 
	/*// driver.close();
	FileInputStream file = new FileInputStream(new File("D:\\testuser.xls"));
	HSSFWorkbook wb = new HSSFWorkbook(file);
	HSSFSheet sheet = wb.getSheetAt(0);
	int rowCount = sheet.getLastRowNum() -sheet.getFirstRowNum();
	for(int i = 0; i<=rowCount+1;i++) {
		Cell cell = sheet.getRow(i+1).getCell(2);
		cell.setCellType(cell.CELL_TYPE_STRING);
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(cell.getStringCellValue());
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		cell = sheet.getRow(i+1).getCell(3);
		cell.setCellType(cell.CELL_TYPE_STRING);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(cell.getStringCellValue());
		driver.findElement(By.xpath("//*[@id='passwordNext']//content")).click();
		FileOutputStream fos=new FileOutputStream(new File("D:\\testuser.xls"));
		 // Message to be written in the excel sheet
		     String message = "Pass";
		     // Create cell where data needs to be written.
		     sheet.getRow(i+1).createCell(4).setCellValue(message);
		         
		     // finally write content
		    wb.write(fos);
		 // To click on Account settings dropdown 
		
		 fos.close();*/

		
		
		
		

private HttpClient HttpGet(String string) {
	// TODO Auto-generated method stub
	return null;
}
	
}


