package TestCases;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class BaseClass
{
   public static WebDriver driver;
 public XSSFWorkbook wbook;
 public XSSFSheet sheet;

    @BeforeMethod
    public void setUpDriver()
    {
    driver=new ChromeDriver();
    driver.get("https://www.simplilearn.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
 @BeforeTest
 public void SetUpExcel() throws IOException
 {

  FileInputStream fis = new FileInputStream("exceldata.xlsx");
  wbook = new XSSFWorkbook(fis);
  sheet = wbook.getSheet("Sheet1");

 }

 @AfterTest
 public void CloseExcel() throws IOException
 {
  wbook.close();
 }



}
