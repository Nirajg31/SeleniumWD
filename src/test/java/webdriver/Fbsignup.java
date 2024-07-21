package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Fbsignup
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

       WebElement webElement= driver.findElement(By.partialLinkText("Create new"));
       webElement.click();

       WebElement day=driver.findElement(By.id("day"));
       Select ddday= new Select(day);
       ddday.selectByVisibleText("8");


        WebElement month=driver.findElement(By.id("month"));
        Select mmday= new Select(month);
        mmday.selectByVisibleText("Aug");
//List<String> options= new ArrayList<>();
// for(WebElement option:mmday.getOptions())
// {
//        options.add(option.getText());
//
// }
// for (String option :options)
// {
//     System.out.println(option);
// }

 List<WebElement> dmm= driver.findElements(By.xpath("//select[@id='month']/option"));
 for (WebElement e:dmm)
 {
     System.out.println(e.getText());
 }


        WebElement year=driver.findElement(By.id("year"));
        Select yyyear= new Select(year);
        yyyear.selectByVisibleText("1996");

        WebElement gender=driver.findElement(By.xpath("//label[text()='Female']"));
        gender.click();

        List<WebElement> links=  driver.findElements(By.tagName("a"));
        System.out.println(links.size());







    }
}
