package SeleniumPratice2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class ParameterizationDataProviderWithSameparamerer {
    WebDriver driver;

    @DataProvider(name = "SearchProvider")
    public Object[][] getDataFromDataprovider(Method m) {
        if (m.getName().equalsIgnoreCase("testMethodA")) {
            return new Object[][]{
                    {"Guru99", "India"},
                    {"Suresh Pasam", "UK"},
                    {"Chaitanya Pasam", "USA"},
                    {"Yuvan Pasam", "Canada"}
            };
        } else {
            return new Object[][]{
                    {"Canada"},
                    {"Russia"},
                    {"Japan"},
                    {"USA"},
                    {"Canada"}
            };
        }
    }

    @BeforeTest
    public void EdgeBrowser() {
        System.setProperty("webdriver.edge.driver", "C:/Users/sures/Downloads/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Successfully launch the EdgeBrowser");
    }

    @Test(dataProvider = "SearchProvider")
    public void testMethodA(String author, String searchKey) throws InterruptedException {

        WebElement searchText = driver.findElement(By.name("q"));
        //Search text in search box
        searchText.sendKeys(searchKey);
        //Print author and search string
        System.out.println("Welcome ->" + author + " Your search key is->" + searchKey);
        Thread.sleep(3000);
        String testValue = searchText.getAttribute("value");
        System.out.println(testValue + "::::" + searchKey);
        searchText.clear();
        //Verify if google text box is showing correct value
        Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
    }
    @AfterTest
    public void closeBrowser() {
        driver.quit();
        System.out.println("Successfully close the browser");

    }
}
