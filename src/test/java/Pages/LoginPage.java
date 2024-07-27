package Pages;

import TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.Assert;

public class LoginPage
{
    WebDriver driver= BaseClass.driver;

//Locators===================================================
    @FindBy(linkText ="Log in")
    WebElement LoginText;
    @FindBy(name = "user_login")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(name = "rememberMe")
    WebElement rememberme;

    @FindBy(name = "btn_login")
    WebElement loginbutton;


    @FindBy(className = "error_msg")
    WebElement Error;

    //Function============================================
    public  LoginPage()
    {
        PageFactory.initElements(driver,this);// this is used to initialized the web element
    }
    public void LoginFunction(String useval,String pwdval)
    {
        LoginText.click();
        username.sendKeys(useval);
        password.sendKeys(pwdval);
        rememberme.click();
        loginbutton.click();
    }
    public void ValidateErrorMsg(String ExpMsg) {

        String ActMsg = Error.getText();
        Assert.assertEquals(ExpMsg, ActMsg);
    }

}
