package SeleniumPratice2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestNgParameterization {
    WebDriver driver;

    @Test(priority = 1)
    public void EdgeBrowser() {

        System.setProperty("webdriver.edge.driver", "C:/Users/sures/Downloads/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        System.out.println("Successfully launch the EdgeBrowser");
    }

    @Test(priority = 2)
    @Parameters({"author","searchKey"})
    public void testParameterWithXML(@Optional("Abc") String author, String searchKey) throws InterruptedException{

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");

        WebElement searchText = driver.findElement(By.name("q"));
        //Searching text in google text box
        searchText.sendKeys(searchKey);

        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
        System.out.println("Thread will sleep now");
        Thread.sleep(3000);
        System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+searchKey);
        //verifying the value in google search box
        AssertJUnit.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));

    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
        System.out.println("Successfully close the browser");

    }
}


/*
Two Types of Parameterization

1. With the help of Parameters annotation and TestNG XML file.
@parameters({"name","searchKey"})

- parameter from testng.xml
suite level and test level

2.With the help of DataProvider annotation.
Ex: @DataProvider(name="SearchProvider")

Parameter with DataProvider
With Method, With ITestContext

Types of Parameters in Dataprovider
There are two type of parameters supported by DataProvider method.

Method 1– If the SAME DataProvider should behave differently with different test method , use Method parameter.

Method 2:
ITestContext– It can use to create different parameters for test cases based on groups.

In real-life, you can use ITestContext to vary parameter values based on Test Methods, hosts, configurations of the test.

Summary
Parameterization is require to create Data Driven Testing.
TestNG support two kinds of parameterization, using @Parameter+TestNG.xml and using@DataProvider
In @Parameter+TestNG.xml parameters can be placed in suite level and test level. If
The Same parameter name is declared in both places; test level parameter will get preference over suit level parameter.

using @Parameter+TestNG.xml only one value can be set at a time, but @DataProvider return an 2d array of Object.
If DataProvider is present in the different class then the class where the test method resides,DataProvider should be
static method.
There are two parameters supported by DataProvider are Method and ITestContext.

 */
