package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class windowsExample
{
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement tab=driver.findElement(By.id("tabButton"));
        tab.click();

        List<String> windowlist=new ArrayList<>(driver.getWindowHandles());
        System.out.println("Parent Window"+windowlist.get(0));
        System.out.println("Child window"+windowlist.get(1));
        driver.switchTo().window(windowlist.get(1));
        WebElement webElement=driver.findElement(By.id("sampleHeading"));
        System.out.println(  webElement.getText());
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

    }
}
