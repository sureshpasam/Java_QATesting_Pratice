package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Listeners(value = iMethodListenerExample.class)
public class testNGSeleniumIInvokedMethodListeners {
    WebDriver driver;
    String url = "https://www.javatpoint.com/selenium-tutorial";

    @BeforeTest()
    public void testSetUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("start-maximized");
        System.setProperty("webdriver.chrome.driver", "C:/Users/sures/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        driver = new ChromeDriver(options);
    }

    @Test(alwaysRun = true)
    public void testScript() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
        System.out.println("With out priority set the this method");
    }

    @Test(priority = 1)
    public void testScript1() {

        System.out.println("first ");
    }

    @Test(priority = 1)
    public void testScript3() {

        System.out.println("Three");
    }

    @Test(priority = 1)
    public void testScript2() {

        System.out.println("second");
    }

    @Test(priority = 1)
    public void testScript4() {

        System.out.println("Four");
    }


 /* @Test
   public void TestToFail()
    { System.out.println("This method to test fail");
       Assert.assertTrue(false);
   } */

    @AfterTest()
    public void closeBrowser() {
        driver.quit();
    }
}
