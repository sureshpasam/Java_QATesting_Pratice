package SeleniumPratice2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ActionsClass_RightClickEtc {
    WebDriver driver;
    String url = "http://demo.guru99.com/test/newtours/";

    ActionsClass_RightClickEtc() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("start-maximized");
        options.setHeadless(false);// headless browser
        // Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/Users/sures/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        driver = new ChromeDriver(options);

    }

    public void navigate() {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Successfully navigate the url");
    }

    public void close() {
        driver.quit();
        System.out.println("Successfully close the browser");
    }

    public void actions() throws InterruptedException {
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver
                .findElement(By
                        .xpath("//html/body/div"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr"));
        Actions aa = new Actions(driver);
        aa.moveToElement(link_Home);
        Thread.sleep(30000);
        aa.build();
        Thread.sleep(30000);
        System.out.println("Before mouse over BG color" + td_Home.getCssValue("background-color"));
        aa.perform();
        Thread.sleep(40000);

        System.out.println("After mouse over BG color" + td_Home.getCssValue("background-color"));
       aa.contextClick().doubleClick();
       aa.doubleClick();

        //Methods:
        /*
        Actions aaa = new Actions(driver);
        CharSequence chhh = null;
        WebElement ele = driver.findElement(By.xpath(""));
        aaa.moveToElement(ele).build().perform();// MoveToELement WebElement parameter
        aaa.clickAndHold(ele).build().perform();
        aaa.release();
        aaa.contextClick().build().perform();
        aaa.doubleClick().build().perform();
        aaa.doubleClick(ele).build().perform();
        aaa.dragAndDrop(ele, link_Home).build().perform();//source and target
        aaa.dragAndDropBy(ele, 20, 50).build().perform();
        aaa.keyDown(chhh).build().perform();// KeyDown accept char
        aaa.keyDown(ele, chhh).build().perform();//WebElement and Char
        aaa.keyUp(ele, chhh).build().perform();//WebElement and Char
        aaa.keyUp(chhh).build().perform();// KeyDown accept char
        aaa.sendKeys().build().perform();
        aaa.sendKeys(ele, chhh).build().perform();
*/

    }

    public static void main(String[] args) throws InterruptedException {
        ActionsClass_RightClickEtc act = new ActionsClass_RightClickEtc();
        act.navigate();
        act.actions();
        act.close();

    }
}


/*
1. create the instance of the Actions class with parameter driver object
2. call the method = MoveToElement--> web element
3. build the element
4. perform
 */
