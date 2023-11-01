package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dynamicWebTablesAndStaticTables {
/*1.’table’ tag defines HTML table.
2.’tbody’ tag defines a container for rows and columns.
3.’tr’ defines rows in an HTML table.
4.’td’/’th’ define the column of an HTML table.
5. th: defines coulmn header of the table
*/
WebDriver driver;
public void dynamicTable(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sures\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.navigate().to("http://demo.guru99.com/test/web-table-element.php");
   List<WebElement> elecols=driver.findElements(By.xpath("//*[@id=\\\"leftcontainer\\\"]/table/thead/tr/th"));
   for (WebElement ele:elecols){
       System.out.println("list of the coulmns in the "+ele);
   }


    WebElement ele=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody"));
    List<WebElement> row=ele.findElements(By.tagName("tr"));
    for (int i=0;i< row.size();i++) {
        List<WebElement> cols = row.get(i).findElements(By.tagName("td"));
        for (int j = 0; j < cols.size(); j++) {
            String colText = cols.get(j).getText();
            System.out.println("Each row::"+i+" of the coulmn "+j +" Content of the each coulmn text:::" + colText);
            System.out.println("*********************************************************************");


        }
    }
driver.quit();
}
public static void main(String[] args){
    dynamicWebTablesAndStaticTables d= new dynamicWebTablesAndStaticTables();
    d.dynamicTable();

}
}
