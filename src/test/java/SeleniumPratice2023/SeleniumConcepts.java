package SeleniumPratice2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class SeleniumConcepts {
    WebDriver driver;
    String url = "http://demo.guru99.com/test/newtours/register.php";

    SeleniumConcepts() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("start-maximized");
        options.setHeadless(false);// headless browser
        // Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/Users/sures/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        /*
        // firefox browser
        // System.setProperty("webdriver.gecko.driver",Path_of_Firefox_Driver");
        //driver = new FirefoxDriver();
        //IE browser
        System.setProperty("webdriver.ie.driver", "D:\\IE Driver Server\\IEDriverServer.exe");

        // Instantiate a IEDriver class.
        WebDriver driver = new InternetExplorerDriver();

       */

        driver = new ChromeDriver(options);
    }

    public void navigate() {
        driver.get(url);
        System.out.println("Navigate to the url");

    }

    public void close() {
        driver.quit();
        driver.close();
        System.out.println("Close the browser..");

        /*
        Methods of the webdriver commands

        driver.get("");// parameter string
        driver.navigate().to(""); para url
        driver.navigate().to(""); String
        driver.navigate().toString();// void
         driver.navigate().back();/ void
        driver.navigate().forward();// void
        driver.navigate().refresh();// void
        driver.getTitle();
        driver.getCurrentUrl();//Return string
        driver.getPageSource();// Return String
        driver.findElements(By.xpath("")); //webelement
        driver.findElements(By.xpath(""));// List of webelements
         driver.close();
        driver.quit();
        driver.getWindowHandle();// string
        driver.getWindowHandles();//set<String>
        driver.switchTo().window("");//webdriver
        Alert s =driver.switchTo().alert();
        s.accept();
        s.dismiss();
        s.getText();
        s.sendKeys("");
        driver.switchTo().defaultContent();//webdriver
        driver.switchTo().parentFrame();//webdriver
        driver.switchTo().frame("");//webdriver
        driver.switchTo().frame(2);
        WebElement ele = null;
        driver.switchTo().frame(ele);//webdriver
        driver.switchTo().defaultContent();//webdriver
        driver.switchTo().activeElement();//weblement


     */

        // operations for webelements
        /*
        driver.findElement(By.xpath("")).getText();
        driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("")).sendKeys();
        driver.findElement(By.xpath("")).clear();
        driver.findElement(By.xpath("")).getAttribute("");
        driver.findElement(By.xpath("")).getLocation().getX();
        driver.findElement(By.xpath("")).getTagName();
        driver.findElement(By.xpath("")).isDisplayed();
        driver.findElement(By.xpath("")).isEnabled();
        driver.findElement(By.xpath("")).isSelected()
        driver.findElement(By.xpath("")).submit();

         */
        /*
        //ImplicitWait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.alertIsPresent());
        wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath(""),true));
        WebElement ele =driver.findElement(By.xpath(""));
        wait.until(ExpectedConditions.elementSelectionStateToBe(ele,true));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
        wait.until(ExpectedConditions.elementToBeClickable(ele));
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("")));
        wait.until(ExpectedConditions.elementToBeSelected(ele));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("")));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(""));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
        wait.until(ExpectedConditions.invisibilityOf(ele));
        wait.until(ExpectedConditions.invisibilityOfAllElements(ele));
        List<WebElement> li = driver.findElements(By.xpath(""));
        wait.until(ExpectedConditions.invisibilityOfAllElements(li));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
        wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(""),""));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
        wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(By.xpath(""),By.xpath("")));
        wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(ele,By.xpath("")));
        Pattern p = new Pattern("",1);
        wait.until(ExpectedConditions.textMatches(By.xpath(""),p));
        wait.until(ExpectedConditions.textToBe(By.xpath(""),""));
        wait.until(ExpectedConditions.textToBePresentInElement(ele,""));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(""),""));
        wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath(""),""));
        wait.until(ExpectedConditions.textToBePresentInElementValue(ele,""));
        wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(""),""));
        wait.until(ExpectedConditions.titleIs(""));
        wait.until(ExpectedConditions.titleContains(""));
        wait.until(ExpectedConditions.visibilityOf(ele));
        wait.until(ExpectedConditions.visibilityOfAllElements(li));
        wait.until(ExpectedConditions.visibilityOfAllElements(ele));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
        */

/*
// Fluent wait
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(30000,TimeUnit.MILLISECONDS);
        wait.pollingEvery(10, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));


*/


    }

    public static void main(String[] args) {
        SeleniumConcepts c = new SeleniumConcepts();
        c.navigate();
        c.close();
    }
}

/*
1. how to open the different browsers in selenium
List of the locators
id
name
class name
css selector
xpath
linktext
partial link text
tagname

abosulte path start with html
relative xpath start with //

Methods of the webdriver in the above script
WEbElements operations
findelement and findelements:

findelement:
1. its return the webelement
2. if element is not found page- returns nosuchelementfound expection
Find elements:
1. its returnd list of elements
2. if the element is not found , it returns the empty list

Implicit wait:

1. Its global wait, once define implicit wait, it appliciable for the all elements
2. Before the throwing expection it will specified time
3. out time is 30 sec, web element loaded 20sec - will not wait remaining 10 sec

Explicit wait:

1. its not global wait, its applicable for the specific element and expected conditions
2. its appliciable for the visiable and non-visiablity elements also
3.  maximum time exceeded before throwing “ElementNotVisibleException” exception

Fluent Wait:
1. its appliciable for the visiable and non-visiablity elements also
2. its ignore the NosuchelementFound Exceptions
3.we can also specify the maximun polling time with perticularu duration, webdriver check every specified time,
element is present or not
4.Frequency: Setting up a repeat cycle with the time frame to verify/check the condition at the regular interval of time

Let’s consider a scenario where an element is loaded at different intervals of time.
The element might load within 10 seconds, 20 seconds or even more then that if we declare an explicit wait of 20 seconds.
 It will wait till the specified time before throwing an exception.
 In such scenarios, the fluent wait is the ideal wait to use as this will
try to find the element at different frequency until it finds it or the final timer runs out.

5. with specific conditions



 */