package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LaunchBrowser
{
    public static void main(String[] args)
    {
//     In Selenium, use locators to identify web elements efficiently:
//        ID: driver.findElement(By.id("elementId"));
//        Name: driver.findElement(By.name("elementName"));
//        Class Name: driver.findElement(By.className("elementClass"));
//        Tag Name: driver.findElement(By.tagName("tagName"));
//        Link Text: driver.findElement(By.linkText("Exact Link Text"));
//        Partial Link Text: driver.findElement(By.partialLinkText("Partial Link Text"));
//        CSS Selector: driver.findElement(By.cssSelector("cssSelector"));
//        XPath: driver.findElement(By.xpath("xpathExpression"));
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.simplilearn.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement LoginLink = driver.findElement(By.linkText("Log in"));
        LoginLink.click();
    }
}
