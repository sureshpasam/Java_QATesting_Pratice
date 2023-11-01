package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class multipileWindowHandles {
    WebDriver driver;
multipileWindowHandles() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sures\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://www.naukri.com/");
    List<WebElement> li=driver.findElements(By.xpath("//div[@class='mTxt']"));
    for(int i=0;i<=6;i++){
        li.get(i).click();
        System.out.println("Browser current URL iss ::"+driver.getCurrentUrl());
        System.out.println("Browser title is ::"+driver.getTitle());
    }
    String parentWin=driver.getWindowHandle();
    System.out.println("Browser title is ::"+parentWin);
    Set<String> set=driver.getWindowHandles();
    List<String> list = new ArrayList<>(set);
    // Navigate to Third window
   driver.switchTo().window(list.get(3));
    Thread.sleep(30);
    System.out.println("Third window of the url ::::" + driver.switchTo().window(list.get(3)).getCurrentUrl());
   System.out.println("Third window of the ::::" + driver.switchTo().window(list.get(3)).getTitle());
   driver.switchTo().window(parentWin);
    /// Navigate to last window of the windowHandles in the browser..
    TreeSet<String> set1= new TreeSet<>(set);
//    driver.switchTo().window(set1.last());
//    Thread.sleep(30);
//    System.out.println("Last window of the url ::::" + driver.switchTo().window(set1.last()).getCurrentUrl());
//    System.out.println("Last window of the ::::" + driver.switchTo().window(set1.last()).getTitle());

  /* Iterator<String>it =set.iterator();
    while (it.hasNext()) {
       String child_window = it.next();
        if (!parentWin.equals(child_window)) {
            driver.switchTo().window(child_window);
            System.out.println("windows handleing concept of the in selenium" + driver.switchTo().window(child_window).getTitle());
        }
   }
*/
    driver.quit();
}
public static void main(String args[]) throws InterruptedException {
    multipileWindowHandles m = new multipileWindowHandles();

}
}
