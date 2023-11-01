package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
/*switchTo.frame(int  frame number): Defining the frame index number, the Driver will switch to that specific frame
        switchTo.frame(string  frameNameOrId): Defining the frame element or Id, the Driver will switch to that specific frame
        switchTo.frame(WebElement  frameElement): Defining the frame web element, the Driver will switch to that specific frame
        iFrame retruns the webdriver instance

How to switch back to the Main Frame
We have to come out of the iframe.
To move back to the parent frame, you can either use switchTo().parentFrame() or
 if you want to get back to the main (or most parent) frame, you can use switchTo().defaultContent();
	    driver.switchTo().parentFrame();
	    driver.switchTo().defaultContent();
        */
public class multIFrameHandling  {
    WebDriver driver;
    multIFrameHandling() throws NoSuchFrameException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sures\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("http://demo.guru99.com/test/guru99home/");
        List<WebElement> list=driver.findElements(By.tagName("iframe"));
        System.out.println("Size of the iFrame:;"+list.size());
        for (int i=0;i<=list.size();i++){
            driver.switchTo().frame(list.get(i));
            System.out.println("list of the frames in the WEB PAGE web page:::"+ driver.switchTo().frame(list.get(i)).getTitle());
            System.out.println("list of the frames in the WEB current url:::"+ driver.switchTo().frame(list.get(i)).getCurrentUrl());
        }
        driver.switchTo().parentFrame();
        System.out.println("list of the frames in theDefault content of the:::"+ driver.switchTo().defaultContent());


driver.quit();
    }

    public static void main(String[] args){
multIFrameHandling mm= new multIFrameHandling();
    }
}
