package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Fblogin
{
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement username = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("pass"));
        WebElement Loginbutton = driver.findElement(By.name("login"));


        username.sendKeys("abc@abc.com");

        password.sendKeys("abc@abc");

        Loginbutton.click();
       // driver.close();
    }
}
