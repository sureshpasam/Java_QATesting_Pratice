package SeleniumPratice2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG_Pratice {
    WebDriver driver;

    @Test(priority = 1)
    public void EdgeBrowser() {

        System.setProperty("webdriver.edge.driver", "C:/Users/sures/Downloads/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        System.out.println("Successfully launch the EdgeBrowser");
    }

    @Test(priority = 2)
    public void ChromeBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("start-maximized");
        options.setHeadless(false);// headless browser
        // Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/Users/sures/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        driver = new ChromeDriver(options);
        System.out.println("Successfully launch the Chrome Browser");


    }

//    @Test
//    public void FirefoxBrowser() {
//        System.setProperty("webdriver.gecko.driver", "C:/Users/sures/Downloads/geckodriver.exe");
//        driver = new FirefoxDriver();
//        System.out.println("Successfully launch the firefox Browser");
//        driver.quit();

    //  }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
        System.out.println("Successfully close the browser");

    }

}
/*
What is TestNG?
TestNG is an automation testing framework in which NG stands for “Next Generation”.
to write the selenium scripts through annotations


Why Use TestNG with Selenium?

Generate the report in a proper format including a number of test cases runs, the number of test cases passed,failed and skipped.

Multiple test cases can be grouped more easily by converting them into testng.xml file.
In which you can make priorities which test case should be executed first.

The same test case can be executed multiple times without loops just by using keyword called ‘invocation count.’

Using testng, you can execute multiple test cases on multiple browsers, i.e., cross browser testing.

The TestNG framework can be easily integrated with tools like TestNG Maven, Jenkins, etc.

Annotations used in the testing are very easy to understand ex: @BeforeMethod, @AfterMethod, @BeforeTest, @AfterTest

WebDriver has no native mechanism for generating reports. TestNG can generate the report in a readable format

TestNG simplifies the way the tests are coded. There is no more need for a static main method in our tests.
The sequence of actions is regulated by easy-to-understand annotations that do not require methods to be static.

Uncaught exceptions are automatically handled by TestNG without terminating the test prematurely.
These exceptions are reported as failed steps in the report.

Sequence of the execution of the TestNG Annotations:

@BeforeSuite
@BeforeTest
@BeforeClass
@BeforeMethod
@Test
@AfterMethod
@AfterClass
@AfterTest
@AfterSuite

If priority is same - it will execute alphabeticall  order
Multiple Parameters
Aside from “priority,” @Test has another parameter called “alwaysRun” which can only be set to either “true” or “false.”
To use two or more parameters in a single annotation, separate them with a comma such as the one shown below.

@Test(priority = 0, alwaysRun = true)
@Test(groups={"Groups"})
testmg.xml
    <groups>
            <run>
                <include name="Group1" />
                <include name="Group2" />
            </run>
        </groups>

Including test tag:
<test name="Guru 99 Smoke Test Demo">
        <classes>
            <class name="SeleniumPratice2023.TestNGGroups">
                <methods>
                    <include name="tc01LaunchURL"/>
                    <include name="tc03EnterCredentials"/>
                    <include name="tc05VerifyHyperlinks"/>
                </methods>
            </class>
        </classes>
    </test>

 */