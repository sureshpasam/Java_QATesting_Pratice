package SeleniumPratice2023;

import org.jsoup.helper.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumDropdown {
    WebDriver driver;
    String url = "http://demo.guru99.com/test/newtours/register.php";

    SeleniumDropdown() {
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
        System.out.println("Successfully navigate the url");
    }

    public void close() {
        driver.quit();
        System.out.println("Successfully close the browser");
    }

    public void dropdown() {
//select[@name='country']/option
        Select sel = new Select(driver.findElement(By.xpath("//select[@name='country']")));
        sel.getFirstSelectedOption();//Returns the web element
        System.out.println("Get the First Selected Option " + sel.getFirstSelectedOption().getText());
        List<WebElement> li = sel.getAllSelectedOptions();// Returns the all list of elements
        System.out.println("Get the getAllSelectedOptions method " + li.size());
        System.out.println("Get the getAllSelectedOptions method " + li.get(0).getText());
        List<WebElement> ell = sel.getOptions();
        for (WebElement ele : ell) {
            System.out.println("getOptions method return :: " + ele.getText());


        }

        // List of methods for dropdown
/*
        sel.getOptions();// Returns list of values in the dropdown()
        sel.getFirstSelectedOption();//return first selected option in the dropdown
        sel.getAllSelectedOptions();// Get all selected values in the dropdown
        sel.isMultiple();// return true or false
        sel.selectByIndex(0);// select by dropdown thorugh index
        sel.selectByValue("");// select the value in dropdpwn through text
        sel.selectByVisibleText("");//// select the value in dropdpwn through text
        sel.deselectAll();
        sel.deselectByIndex();
        sel.deselectByValue();
        sel.deselectByVisibleText();
        */

    }

    public static void main(String[] args) {
        SeleniumDropdown s = new SeleniumDropdown();
        s.navigate();
        s.dropdown();
        s.close();

    }
}
