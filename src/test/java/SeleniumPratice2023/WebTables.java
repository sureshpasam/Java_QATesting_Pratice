package SeleniumPratice2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTables {
    WebDriver driver;
    String url = "https://www.bseindia.com/publicissue.html";

    public void browserLaunch() {
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
        System.out.println("Successfully the navigate to the url browser");

    }

    public void close() {
        driver.quit();
        System.out.println("Successfully the close browser");
    }

    public void readRowsColumnsCell() {

        //div[@class='largetable']/table/tbody/tr/td/table/tbody/tr[1]/th

        // finding the no of rows
        List<WebElement> rows = driver.findElements(By.xpath("//div[@class='largetable']/table/tbody/tr/td/table/tbody/tr"));
        System.out.println("Rows Size:: " + rows.size());

        // finding the no of web table headers
        List<WebElement> headers = driver.findElements(By.xpath("//div[@class='largetable']/table/tbody/tr/td/table/tbody/tr[1]/th"));
        // finding the no of columns cell data
        List<WebElement> columnsData = driver.findElements(By.xpath("//div[@class='largetable']/table/tbody/tr/td/table/tbody/tr/td"));

        for (WebElement head : headers) {
            System.out.println(head.getText() + " || ");
            for (WebElement col : columnsData) {
                System.out.println(col.getText() + " || ");

            }
        }

// Finding the last cell data for web table
        int LastCellValue = columnsData.size() - 2;
        System.out.println("Last cell data::  " + columnsData.get(LastCellValue).getText());

    }


    public static void main(String[] args) {
        WebTables web = new WebTables();
        web.browserLaunch();
        web.navigate();
        web.readRowsColumnsCell();
        web.close();
    }
}

/*
Html Tags for Web Tables:

<table>: The main container tag that defines the start and end of the table.
<thead>: Represents the table header section. It is typically used to group the header content,
which usually consists of <th> (table header) elements.
<tbody>: Represents the table body section. It contains the main data rows of the table,
typically defined using <tr> (table row) elements.
<tfoot>: Represents the table footer section. It is used to group the footer content,
 which may include a summary or aggregation of information for the table.
 Footer content is often enclosed within <td> (table data) elements.
<tr>: Defines a table row. It contains one or more <td> (table data) or
 <th> (table header) elements that represent the cells within that row.
<th>: Defines a table header cell. It is used to represent the header content for a
 column or row. <th> elements are typically placed within the <thead> section.
<td>: Defines a table data cell. It represents a data entry within a table row.
 <td> elements are typically placed within the <tbody> section.
 */
