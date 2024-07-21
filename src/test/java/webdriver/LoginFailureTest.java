package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class LoginFailureTest
{
    public static void main(String[] args)
   {
        // WebDriver driver=new FirefoxDriver();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.simplilearn.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       WebElement LoginText= driver.findElement(By.linkText("Log in"));
       LoginText.click();

       WebElement username=driver.findElement(By.name("user_login"));
       username.sendKeys("abc23@xyz");

       WebElement password=driver.findElement(By.id("password"));
       password.sendKeys("ABC@123");

       WebElement rememberme=driver.findElement(By.name("rememberMe"));
       rememberme.click();

       WebElement loginbutton= driver.findElement(By.name("btn_login"));
       loginbutton.click();

       System.out.println("Page Title :"+driver.getTitle());
       System.out.println("Page current url :"+driver.getCurrentUrl());
       WebElement errormsg=driver.findElement(By.className("error_msg"));
       System.out.println( errormsg.getText());

       driver.close();





    }
}
