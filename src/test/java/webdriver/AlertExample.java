package webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertExample
{
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        WebElement clickme= driver.findElement(By.id("alertButton"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickme);
        clickme.click();
        Alert alert=driver.switchTo().alert();
        System.out.println("Alert1  message is :"+alert.getText());
        alert.accept();//this will click on the ok button of the alert

        WebElement clickme1= driver.findElement(By.id("promtButton"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickme1);
        clickme1.click();
        Alert alert1=driver.switchTo().alert();
        System.out.println("Alert message is "+alert1.getText());
        alert1.sendKeys("Hello World");
        alert1.accept();


    }
}
