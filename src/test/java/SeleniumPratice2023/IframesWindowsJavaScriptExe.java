package SeleniumPratice2023;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class IframesWindowsJavaScriptExe {
    WebDriver driver;

    public void browserLaunch() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("start-maximized");
        options.setHeadless(false);// headless browser
        // Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/Users/sures/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        driver = new ChromeDriver(options);

    }

    public void navigate(String url) {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Successfully the navigate to the url browser");

    }

    public void close() {
        driver.quit();
        System.out.println("Successfully the close the browser");

    }

    public void alert() throws InterruptedException {

        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();

        // Switching to Alert
        Alert alert = driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage = driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(5000);

        // Accepting alert

        System.out.println("Successfully handle the alert popups");
        alert.accept();

    }

    public void windowHandles() {
        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
        String MainWindow = driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();

        for (String ChildWindow : s1) {
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.name("emailid"))
                        .sendKeys("sureshpasam94@gmail.com");

                driver.findElement(By.name("btnLogin")).click();
                System.out.println("Successfully Navigated the child window and perfomed the actions");

                // Closing the Child Window.
                driver.close();

            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
        System.out.println("Successfully Navigated main window");

    }


    public void Iframes() {
        driver.manage().window().maximize();
        driver.switchTo().frame("a077aa5e"); //switching the frame by ID

        System.out.println("********We are switch to the iframe*******");
        driver.findElement(By.xpath("html/body/a/img")).click();
        //Clicks the iframe
        System.out.println("*********We are done***************");
    }

    public void Iframes1() {
        driver.manage().window().maximize();
        List<WebElement> list = driver.findElements(By.tagName("iframe"));
        System.out.println("*********Frames Size***************"+list.size());
        for (int i =0;i<=list.size();i++){
            driver.switchTo().frame(i);
            int total=driver.findElements(By.xpath("html/body/a/img")).size();
            System.out.println(total);
            System.out.println("Default content is ::"+driver.switchTo().defaultContent());


        }
        driver.switchTo().parentFrame();

    }

    public void allJavaScriptExecutorMethods() {

    }


    public static void main(String[] args) throws InterruptedException {
        IframesWindowsJavaScriptExe AFWJs = new IframesWindowsJavaScriptExe();
        AFWJs.browserLaunch();
        //AFWJs.navigate("https://demo.guru99.com/test/delete_customer.php"); // alret handling
        //AFWJs.alert();

        //AFWJs.navigate("https://demo.guru99.com/popup.php");// Window popups handles
        // AFWJs.windowHandles();
        AFWJs.navigate("https://demo.guru99.com/test/guru99home/");// Window popups handles
        AFWJs.Iframes1();
        AFWJs.close();

    }
}

/*
How to Handle Frames in Selenium using WebDriver Commands
Basically, we can switch over the elements and handle frames in Selenium using 3 ways.

By Index
By Name or Id
By Web Element
Method 1: Switch to the frame by index
Index is one of the attributes for frame handling in Selenium through which we can switch to it.

Index of the iframe starts with ‘0’.

Suppose if there are 100 frames in page, we can switch to frame in Selenium by using index.

driver.switchTo().frame(0);
driver.switchTo().frame(1);
Method 2: Switch to the frame by Name or ID
Name and ID are attributes for handling frames in Selenium through which we can switch to the iframe.

driver.switchTo().frame("iframe1");
driver.switchTo().frame("id of the element");


Method 3: Switch to the frame by Web Element
We can even switch to the iframe using web element .

driver.switchTo().frame(WebElement);
How to switch back to the Main Frame

We have to come out of the iframe.

To move back to the parent frame, you can either use switchTo().parentFrame() or if you want to get back to the main
(or most parent) frame, you can use switchTo().defaultContent();

	    driver.switchTo().parentFrame();
	    driver.switchTo().defaultContent();
How to switch over the frame, if we CANNOT switch using ID or Web Element:

Suppose if there are 100 frames in the page, and there is no ID available, in this case,
we just don’t know from which iframe required element is being loaded
(It is the case when we do not know the index of the frame also).

The solution for the above concern is, we must find the index of the iframe through
 which the element is being loaded and then we need to switch to the iframe through the index.

Below are the steps for finding the index of the Frame by which the element is being loaded by using below snippet
 */
