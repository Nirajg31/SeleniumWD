package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IFrameExample
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.switchTo().frame("frame1");
        WebElement FrameHeader = driver.findElement(By.id("sampleHeading"));
        System.out.println("Header of the iframe is " + FrameHeader.getText());

// switch back to original window
        driver.switchTo().defaultContent();

    }
}
