package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dropDownExamples {
    WebDriver driver;
    dropDownExamples() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sures\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.MICROSECONDS) ;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        Select sel = new Select(driver.findElement(By.xpath("*//select[@name='country']")));
        List<WebElement> list = sel.getOptions();
        List<WebElement> li = sel.getAllSelectedOptions();
        //sel.getAllSelectedOptions(); --> it retreive the list of web elements selected options
        // sel.selectByVisibleText(); --> Selected visible text for the dropdown option
        //sel.getFirstSelectedOption();--> it retrieve the first selected option in the dropdown.
        for (WebElement ele : li) {
            System.out.println("Get all selected options for the dropdown::" + ele.getText());
        }
        System.out.println("Size of the given::" + list.size());
        for (WebElement ele : list) {
            System.out.println("Given text of the dropdown::" + ele.getText());
            if (ele.getText().equals("BAHRAIN")) {
                System.out.println("suresh");
                sel.selectByVisibleText("BAHRAIN");
                System.out.println("suresh");
            }

        }
        driver.quit();

    }

    public static void main(String args[]) {
        dropDownExamples drp = new dropDownExamples();

    }
}
