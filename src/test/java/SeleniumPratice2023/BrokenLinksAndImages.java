package SeleniumPratice2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrokenLinksAndImages {
    WebDriver driver;
    String url = "https://www.guru99.com/cross-browser-testing-using-selenium.html";

    BrokenLinksAndImages() {
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

    public void crossLinksAndBrokenLinksImages() throws IOException {
        List<WebElement> ell = driver.findElements(By.tagName("a"));

        for (int i = 0; i < ell.size(); i++) {

            System.out.println("getOptions method return :: " + ell.get(i).getAttribute("href"));
            String links = ell.get(i).getAttribute("href");

            VerifyLinks(links);
        }

    }

    public void VerifyLinks(String url) throws IOException {
        URL u = new URL(url);
        HttpURLConnection http = (HttpURLConnection) u.openConnection();
        http.setConnectTimeout(5000);
        http.connect();
        http.getResponseCode();
        http.getResponseMessage();

        if (http.getResponseCode() == 200) {
            System.out.println("Link is valid" + http.getResponseCode()+" Message  "+http.getResponseMessage());

        } else {
            System.out.println("Link is Invalid " + http.getResponseCode()+" Message  "+http.getResponseMessage());

        }
        http.disconnect();
    }

    public static void main(String[] args) throws IOException {
        BrokenLinksAndImages b = new BrokenLinksAndImages();
        b.navigate();
        b.crossLinksAndBrokenLinksImages();
        b.close();
    }
}

/*
1. create webdriver instance
2. find out the all links with anchor tag
3. interate the loop with all links getAttribute
4. during loop getting each link - pass each link in the URl class
URL u = new URL(<Links>);
5. HttpURLConnection http = (HTTPURLConnection)u.openconnection();
http.connect();
http.getresponcecode();

if(responsecode ==200)
valid other in valid link
 */