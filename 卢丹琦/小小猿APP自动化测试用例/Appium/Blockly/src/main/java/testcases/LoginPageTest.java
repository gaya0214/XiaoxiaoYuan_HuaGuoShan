package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BasePrepare;
import pages.LoginPage;

public class LoginPageTest extends BasePrepare{

    @Test(dataProvider = "")
    public void loginSuccessful(){

        LoginPage loginPage =new LoginPage(driver);
        loginPage.login("1","1");
        System.out.print(driver.currentActivity());
        Assert.assertEquals(".MainActivity",driver.currentActivity());
    }
}
