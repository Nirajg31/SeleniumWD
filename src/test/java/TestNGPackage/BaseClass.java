package TestNGPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass
{
    // incase of  group test case execution we need to set before method as true
    @BeforeMethod(alwaysRun = true)
    public void setup()
    {
        System.out.println("Inside the before method");

    }

    @AfterMethod(alwaysRun = true)
    public void aftermethodset()
    {
        System.out.println("Inside the after method");
    }
    @BeforeTest(alwaysRun = true)
    public void ThisBeforeTest()
    {
        System.out.println("This is before Test method ");
    }
    @AfterTest(alwaysRun = true)
    public void ThisAfterTest()
    {
        System.out.println("This is after Test method ");
    }
}
