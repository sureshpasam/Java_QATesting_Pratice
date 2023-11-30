package SeleniumPratice2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class ParameterizationDataProviderWithITestContext {
    WebDriver driver;
    @BeforeTest(groups = {"A","B"})
    public void EdgeBrowser() {
        System.setProperty("webdriver.edge.driver", "C:/Users/sures/Downloads/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Successfully launch the EdgeBrowser");
    }
    @Test(dataProvider="SearchProvider",groups="A")
    public void testMethodA(String author,String searchKey) throws InterruptedException{
        {
            //search google textbox
            WebElement searchText = driver.findElement(By.name("q"));
            //search a value on it
            searchText.sendKeys(searchKey);
            System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
            Thread.sleep(3000);
            String testValue = searchText.getAttribute("value");
            System.out.println(testValue +"::::"+searchKey);
            searchText.clear();
            //verify correct value in searchbox
            Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
        }
    }

    @Test(dataProvider="SearchProvider",groups="B")
    public void testMethodB(String searchKey) throws InterruptedException{
        {
            //find google search box
            WebElement searchText = driver.findElement(By.name("q"));
            //search a value on it
            searchText.sendKeys(searchKey);
            System.out.println("Welcome ->Unknown user Your search key is->"+searchKey);
            Thread.sleep(3000);
            String testValue = searchText.getAttribute("value");
            System.out.println(testValue +"::::"+searchKey);
            searchText.clear();
            //verify correct value in searchbox
            Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
        }
    }

    /**
     * Here the DAtaProvider will provide Object array on the basis on ITestContext
     * @param c
     * @return
     */
    @DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(ITestContext c){
        Object[][] groupArray = null;
        for (String group : c.getIncludedGroups()) {
            if(group.equalsIgnoreCase("A")){
                groupArray = new Object[][] {
                        { "Guru99", "India" },
                        { "Krishna", "UK" },
                        { "Bhupesh", "USA" }
                };
                break;
            }
            else if(group.equalsIgnoreCase("B"))
            {
                groupArray = new Object[][] {
                        {  "Canada" },
                        {  "Russia" },
                        {  "Japan" }
                };
            }
            break;
        }
        return groupArray;
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
        System.out.println("Successfully close the browser");

    }

}
