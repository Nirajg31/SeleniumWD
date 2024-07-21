package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TableExample
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();



        //Total number of rows in the table

        List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
        System.out.println("Total number of rows " + Rows.size());


        List<WebElement> Tableheader = driver.findElements(By.xpath("//table[@id='customers']//th"));
        System.out.println("Total number of columns " + Tableheader.size());

        String CompanyName= "Alfreds Futterkiste";

        WebElement webElement=driver.findElement(By.xpath("//td[text()='"+CompanyName+"']/following-sibling::td[1]"));
        WebElement webElement1=driver.findElement(By.xpath("//td[text()='"+CompanyName+"']/following-sibling::td[2]"));
        System.out.println(webElement.getText());
        System.out.println(webElement1.getText());






    }
}
