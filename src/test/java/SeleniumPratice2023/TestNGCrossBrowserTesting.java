package SeleniumPratice2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNGCrossBrowserTesting {
    WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void CrossBrowsers(String browser) {
        switch (browser) {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("disable-infobars");
                options.addArguments("start-maximized");
                options.setHeadless(false);// headless browser
                // Chrome browser
                System.setProperty("webdriver.chrome.driver", "C:/Users/sures/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
                driver = new ChromeDriver(options);
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", "C:/Users/sures/Downloads/edgedriver_win32 (1)/msedgedriver.exe");
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                driver.get("https://google.com");
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                System.out.println("Successfully launch the EdgeBrowser");
                break;
            case "firefox":
                System.setProperty("webdriver.edge.driver", "C:/Users/sures/Downloads/msedgedriver.exe");
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                driver.get("https://google.com");
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                System.out.println("Successfully launch the EdgeBrowser");
                break;
            default:
                System.out.println("Not specified the browser parameter");
        }
    }

    @Test
    public void testParameterWithXML() throws InterruptedException {
        driver.get("http://demo.guru99.com/V4/");
        //Find user name
        WebElement userName = driver.findElement(By.name("uid"));
        //Fill user name
        userName.sendKeys("guru99");
        //Find password
        WebElement password = driver.findElement(By.name("password"));
        //Fill password
        password.sendKeys("guru99");
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
        System.out.println("Successfully close the browser");

    }
}

