package TestCases;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LoginTest extends BaseClass
{
    @Test
    public void TC01_LoginFailrueTest() {

        LoginPage loginPage = new LoginPage();
        loginPage.LoginFunction("abx@xyz.com", "Abc@1234");
        loginPage.ValidateErrorMsg("The email or password you have entered is invalid.");
    }
    @Test
    public void TC02_LoginSuccessTest()
    {
        LoginPage loginPage=new LoginPage();
        loginPage.LoginFunction("nirajnrjg@gmail.com","Simpli@123");

    }
@Test
@Parameters({"param1","param2"})
    public void TC03_LoginFailrueTest(String uname, String  pwd)
    {
        LoginPage loginPage=new LoginPage();
       // loginPage.LoginFunction("nirajnrjg@gmail.com","Simpli@123");
         loginPage.LoginFunction(uname, pwd);
        loginPage.ValidateErrorMsg("The email or password you have entered is invalid.");

    }
    @Test(dataProvider = "dp")
    public void TC04_LoginFailrueTest(String key)
    {
        LoginPage loginPage=new LoginPage();
        // loginPage.LoginFunction("nirajnrjg@gmail.com","Simpli@123");
        loginPage.LoginFunction(key,testdata.get(key));
        loginPage.ValidateErrorMsg("The email or password you have entered is invalid.");

    }
    @Test
    public void TC05_LoginFailrueTest_ExcelData()
    {

        LoginPage loginPage = new LoginPage();
        String userval= sheet.getRow(1).getCell(0).getStringCellValue();
        String passwordval= sheet.getRow(1).getCell(1).getStringCellValue();
        loginPage.LoginFunction(userval,passwordval) ;
        loginPage.ValidateErrorMsg("The email or password you have entered is invalid.");
    }



    Map<String,String> testdata =new HashMap<String,String>();
    @DataProvider (name="dp")
    public Iterator<String> method1()
    {
        testdata.put("aaa@xyz.com","Abc@123");
        testdata.put("bbb@xyz.com","Abc@1234");
        testdata.put("ccc@xyz.com","Abc@1235");
        return  testdata.keySet().iterator();
    }

}
