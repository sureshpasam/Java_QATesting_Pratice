package SeleniumPratice2023;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ExceptionsAndWriteDiffXpath {
    WebDriver driver;
    String url = "https://demo.guru99.com/V4/";

    public void browserLaunch() {
        // firefox  browser
//        System.setProperty("webdriver.gecko.driver", "C:/Users/sures/Downloads/geckodriver.exe");
////        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
////        capabilities.setCapability("marionette",true);
////        driver = new FirefoxDriver(capabilities);
//        FirefoxOptions option = new FirefoxOptions();
//        option.setLegacy(true);
//        driver = new FirefoxDriver(option);
//        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("start-maximized");
        options.setHeadless(false);// headless browser
        // Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/Users/sures/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        driver = new ChromeDriver(options);
    }

    public void differentWaysXpaths() {
        /*
        1. Basic xpath
        Xpath=//input[@name='uid']

        2. Contains method
        Xpath=//*[contains(@type,'sub')]
        Xpath=//*[contains(@name,'btn')]
        3. Using OR & AND Condition
        //*[@type='submit' or @name='btnReset']
        4. Xpath Starts-with

        //label[starts-with(@id,'message')]
        5. Text method

        //label[text()='Close']

XPath axes methods:
         1.  Following:
            Selects all elements in the document of the current node( )
            [ UserID input box is the current node] as shown in the below screen.

            Xpath=//*[@type='text']//following::input  // returns three nodes
            //*[@type='text']//following::input[1] // return one node

2) Ancestor:
The ancestor axis selects all ancestors element (grandparent, parent, etc.)
 of the current node as shown in the below screen.


        //*[text()='SAP']//ancestor::div
//*[text()='SAP']//ancestor::div[1]

   3. Selects all children elements of the current node (Java) as shown in the below screen.
   //*[@id='java_technologies']//child::li

   //*[@id='java_technologies']//child::li[1]

        4) Preceding:
        Select all nodes that come before the current node as shown in the below screen.
        //*[@type='submit']//preceding::input
        //*[@type='submit']//preceding::input[1]

5. Following-sibling:
Select the following siblings of the context node. Siblings are at the same level of the current node as shown in the below screen.
 It will find the element after the current node.

 //*[@type='submit']//following-sibling::input
    6.      Parent:
        Selects the parent of the current node as shown in the below screen.

                Xpath=//*[@id='rt-feature']//parent::div
      Xpath=//*[@id='rt-feature']//parent::div[1]
7. Self:
Selects the current node or ‘self’ means it indicates the node itself as shown in the below screen.


      7. //*[@type='password']//self::input
         */


    }

    public void navigate() {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Successfully the navigate to the url browser");

    }

    public void close() {
        driver.quit();
        System.out.println("Successfully the close browser");
    }

    public void exceptios() {
        try {
            System.out.println("Exception is::");

        } catch (ElementNotVisibleException | NoSuchElementException | StaleElementReferenceException | ElementNotSelectableException e) {
            System.out.println("Exception is::" + e.getMessage());

        }
    }

    public void ScreenShot() {
        // convert webdriver object to TakesScreenshot
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File file = screenshot.getScreenshotAs(OutputType.FILE);
        System.out.println("Screenshot of the page is:: " + file);

    }


    public static void main(String[] args) {
        ExceptionsAndWriteDiffXpath xpa = new ExceptionsAndWriteDiffXpath();
        xpa.browserLaunch();
        xpa.navigate();
        xpa.ScreenShot();
        xpa.close();
    }
}

/*
Types of Exceptions in Selenium Webdriver
1. ElementNotVisibleException: This type of Selenium exception occurs when an existing element in DOM has

a feature set as hidden.

2. ElementNotSelectableException: This Selenium exception occurs when an element is presented in the DOM,
 but you can be able to select. Therefore, it is not possible to interact.

3. NoSuchElementException: This Exception occurs if an element could not be found.

4. NoSuchFrameException: This Exception occurs if the frame target to be switched to does not exist.

5. NoAlertPresentException: This Exception occurs when you switch to no presented alert.

6. NoSuchWindowException: This Exception occurs if the window target to be switch does not exist.

7. StaleElementReferenceException: This Selenium exception occurs happens when the web element is detached from the current DOM.

8. SessionNotFoundException: The WebDriver is acting after you quit the browser.


9. TimeoutException: Thrown when there is not enough time for a command to be completed. For Example,
the element searched wasn’t found in the specified time.

10. WebDriverException: This Exception takes place when the WebDriver is acting right after you close the browser.

11. ConnectionClosedException: This type of Exception takes place when there is a disconnection in the driver.

12. ElementClickInterceptedException: The command may not be completed as the element receiving the events is concealing

the element which was requested clicked.

13. ElementNotInteractableException: This Selenium exception is thrown when any element is presented in the DOM.
However, it is impossible to interact with such an element.

14. ErrorInResponseException: This happens while interacting with the Firefox extension or the remote driver server.

15. ErrorHandler.UnknownServerException: Exception is used as a placeholder in case if the server returns an error without
a stack trace.

16. ImeActivationFailedException: This expectation will occur when IME engine activation has failed.

17. ImeNotAvailableException: It takes place when IME support is unavailable.

18. InsecureCertificateException: Navigation made the user agent to hit a certificate warning. This can cause by an invalid
or expired TLS certificate.

19. InvalidArgumentException: It occurs when an argument does not belong to the expected type.

20. InvalidCookieDomainException: This happens when you try to add a cookie under a different domain instead of current URL.

21. InvalidCoordinatesException: This type of Exception matches an interacting operation that is not valid.

22. InvalidElementStateException: It occurs when command can’t be finished when the element is invalid.

23. InvalidSessionIdException: This Exception took place when the given session ID is not included in the list of active
 sessions. It means the session does not exist or is inactive either.

24. InvalidSwitchToTargetException: This occurs when the frame or window target to be switched does not exist.

25. JavascriptException: This issue occurs while executing JavaScript given by the user.

26. JsonException: It occurs when you afford to get the session when the session is not created.

27. NoSuchAttributeException: This kind of Exception occurs when the attribute of an element could not be found.

28. MoveTargetOutOfBoundsException: It takes place if the target provided to the ActionChains move() methodology
is not valid. For Example, out of the document.

29. NoSuchContextException: ContextAware does mobile device testing.

30. NoSuchCookieException: This Exception occurs when no cookie matching with the given pathname found for all the
 associated cookies of the currently browsing document.

31. NotFoundException: This Exception is a subclass of WebDriverException. This will occur when an element on
the DOM does not exist.

32. RemoteDriverServerException: This Selenium exception is thrown when the server is not responding because
of the problem that the capabilities described are not proper.

33. ScreenshotException: It is not possible to capture a screen.

34. SessionNotCreatedException: It happens when a new session could not be successfully created.

35. UnableToSetCookieException: This occurs if a driver is unable to set a cookie.

36. UnexpectedTagNameException: Happens if a support class did not get a web element as expected.

37. UnhandledAlertException: This expectation occurs when there is an alert, but WebDriver is not able to perform Alert
operation.

38. UnexpectedAlertPresentException: It occurs when there is the appearance of an unexpected alert.

39. UnknownMethodException: This Exception happens when the requested command matches with a known URL but and
not matching with a methodology for a specific URL.

40. UnreachableBrowserException: This Exception occurs only when the browser is not able to be opened or
crashed because of some reason.

41. UnsupportedCommandException: This occurs when remote WebDriver doesn’t send valid commands as expected.
 When things go awry: Exceptions in Selenium

Has it happened to you that you went to a restaurant to have a nice dinner and when it’s time to pay the bill,
you realize that you have forgotten your wallet at home? This will be called Wallet Not Found exception in real life.
Similarly, there are instances in Selenium when you intend your code to do something, but it does not do as expected.
They are called exceptions.

When an exception occurs, your program flow disrupts, and it can halt your execution. A programmer should always
handle checked exceptions. To handle exceptions, you should understand what this exception is and how to handle/resolve it.

I will talk about some common exceptions in WebDriver and will discuss their resolutions.

StaleElementReferenceException:

When the element that you are trying to perform an operation on is no longer present on the page or
 DOM has been refreshed then this exception is thrown. A real time scenario is when you click on submit button with


 invalid username and password. And then again when you click on submit button with valid username and password then
 you will get StaleElementReferenceException.

For example:

WebElement username = driver.findElement(By.id(“username”));

      WebElement pwd = driver.findElement(By.id(“password”));

      WebElement submitBtn = driver.findElement(By.id(“submit”));



      username.sendKeys(“invalidUserName”);

      pwd.sendKeys(“invalidPassword”);

      submitBtn.click();



      username.sendKeys(“validUserName”);

      pwd.sendKeys(“validPassword”);

      submitBtn.click();

Resolution: This exception can be resolved by re allocating the element to reference variable.
For example, in order to avoid exception you will have to reallocate username, password and submit button again
before performing scenario with valid username, password.

username = driver.findElement(By.id(“username”));

pwd = driver.findElement(By.id(“password”));

      submitBtn = driver.findElement(By.id(“submit”));



username.sendKeys(“validUserName”);

      pwd.sendKeys(“validPassword”);

      submitBtn.click();

Another standard way of handling this exception is using Page Factory pattern. If you use Page Factory pattern in
your framework then this exception will not occur. The reason is Page Factory does lazy initialization of Web Element.
It searches for element every time when you perform an operation on it. So, every time you want to click or type on an element,
 it reallocates it.




P.S: Do not use @CacheLookup annotation with your element in Page Factory pattern because @CacheLookup annotation caches your
element and does not search it again.

NoSuchElementException:

This is also one of the most common exception in WebDriver. This exception class is the subclass of NotFoundException class.
The reason is your element is no accessible to your code. This occurs because you have given an incorrect locator,
 element is inside the frame or the element is not loaded.

Resolution:

First, check if element is indeed on the page.
Then check if there is any spelling mistake or syntax error in your locator.
If element is inside frame, then you need to switch to frame to access this element.
If element is not loaded due to synchronization issue, then you will have to give some wait time to handle this exception.
Refer my article on waits here.


ElementNotVisibleException:

This exception occurs when an element is present in the DOM but it is not visible on the web page. This exception class is
subclass of ElementNotInteractableException class. It could be that either element is hidden, or it not properly loaded.
So, when WebDriver tries to perform operation on such element then this exception is thrown.

Resolution:

Try to give some wait time before performing operation on the element so that it becomes visible on the web page.
Use visibilityOf(WebElement element) method of WebDriverWait class to ensure visibility of the element. If it is hidden,
 then with the help of indexing try to find locator that is displayed on the page.

ElementNotSelectableException:

This exception is subclass of InvalidElementStateException class. This occurs because an element is present in the DOM but
can not be selected on the web page. This could be because the element is either disabled or already in selected state.

Resolution:

Give some wait time to make element selectable.
Use driver.isEnabled() method to check if element is disabled. If its disabled do not perform operation to avoid exception.
Use driver.isSelected() method to check if element is already selected. If its selected do not perform operation to avoid
exception.
Element is not clickable at point (xx, xx). Other element would receive the click:

I have mentioned this WebDriver exception here because I have faced it in real time. And you also might have faced it.
This occurs when your element is obfuscated by some other div or images. And due to this it does not receive click properly.



Resolution:

Use click from the action class because it clicks in the middle of the element.
Actions action = new Actions(driver);

action.moveToElement(element).click().perform();

Use click from JavaScriptExecutor class.
Also Check: Selenium Training Online

InvalidSelectorException:

This exception is subclass of NoSuchElementException class. This exception occurs when there is syntax error in your Xpath
or CSS Selector. Or when you have used By.id(), By.name(), By.className() etc but passing Xpath or CSS Selector.

Resolution:

This is one of the simplest exceptions to resolve. You just need to check your locator and methods and make sure they
 are correct.

NoSuchSessionException:

This exception is subclass of WebDriverException class. This occurs when your browser is crashes,
 your driver.exe crashes or you execute a piece of code after driver.quit().

Resolution:

Always use stable version of browser and driver.exe
Perform driver.quit() only in after or teardown methods.


Compound class names not permitted:

This is part of WebDriverException. I have mentioned it here because you might be frequently getting
it if you are using class name as your locator. This occurs when you have spaces in your class name.


Resolution:

Replace spaces in your class name with . and this exception will go away.
NoAlertPresentException:

This exception is subclass of NotFoundException class. This occurs when you are trying to accept,
dismiss an alert or read text from an alert that is not yet displayed.

Resolution:

You can use a method to check whether Alert has opened.



public boolean isAlertPresent() {

    try {

    driver.switchTo().alert();

    return true;

    }catch(NoAlertPresentException e) {

    return false;

    }
    }



 */
