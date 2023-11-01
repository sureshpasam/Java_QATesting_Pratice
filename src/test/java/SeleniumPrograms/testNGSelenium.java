package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
@Listeners(SeleniumPrograms.iTestListenersExamplePratice.class)
public class testNGSelenium {
    WebDriver driver;
    String url ="https://www.javatpoint.com/selenium-tutorial";
    @BeforeTest()
    public void testSetUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("start-maximized");
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver = new ChromeDriver(options);
    }
    @Test(alwaysRun = true)
    public void testScript(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
        System.out.println("With out priority set the this method");
    }
    @Test(priority = 1)
    public void testScript1(){

        System.out.println("first ");
    }

    @Test(priority = 1)
    public void testScript2(){

        System.out.println("second");
    }
    @Test
    public void TestToFail()
    {
        System.out.println("This method to test fail");
        Assert.assertTrue(false);
    }

    @AfterTest()
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
