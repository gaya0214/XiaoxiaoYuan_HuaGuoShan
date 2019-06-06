package testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BasePrepare;
import pages.LoginPage;

public class LoginPageTest extends BasePrepare{
    @DataProvider
    public Object[][] dataProvider(){
        return new Object[][]{{1,2},{2,3},{3,4}};
    }

    @Test(dataProvider="dataProvider")
    public void testDataDriven(int a, int b){
        System.out.println("this is : "+(a+b));
    }
    @Test(dataProvider = "")
    public void loginSuccessful(){

        LoginPage loginPage =new LoginPage(driver);
        loginPage.login("1","1");
        System.out.print(driver.currentActivity());
        Assert.assertEquals(".MainActivity",driver.currentActivity());
    }
}
