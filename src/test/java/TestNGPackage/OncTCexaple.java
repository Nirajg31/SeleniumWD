package TestNGPackage;

import org.testng.annotations.*;

public class OncTCexaple extends BaseClass
{


    @Test(priority = 2,groups = {"regression","smoke"})
    public void TC_01()

    {
        System.out.println(" Test case 1 ");
    }

   @Test(priority = 1, enabled=true,groups = {"smoke"})
    public void TC_02()
    {
        System.out.println("Test case 2 ");
    }
    @Test(priority = 1)
    public void TC_03()
    {
        System.out.println("Test case 3 ");
    }
    @Test(priority = 0,groups = {"regression"})
    public void TC_04()
    {
        System.out.println("Test case 4 ");
    }


}
