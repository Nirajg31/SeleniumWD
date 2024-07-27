package TestCases;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseClass
{
    @Test
    public void TC01_LoginFailrueTest() {

        LoginPage loginPage = new LoginPage();
        loginPage.LoginFunction("nirajnrjg@gmail.com", "ABC@123");
        loginPage.ValidateErrorMsg("The email or password you have entered is invalid.");
    }
    @Test
    public void TC02_LoginSuccessTest()
    {
        LoginPage loginPage=new LoginPage();
        loginPage.LoginFunction("nirajnrjg@gmail.com","Simpli@123");

    }

}
