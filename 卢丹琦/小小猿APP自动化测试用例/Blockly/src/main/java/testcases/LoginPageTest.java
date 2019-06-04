package testcases;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BasePrepare;
import pages.LoginPage;
import pages.MenuPage;

public class LoginPageTest extends BasePrepare{
    @DataProvider
    public Object[][] login(){
        return new Object[][]{{"18032430901","111111"},{"18032430902","111111"},{"18032430903","111111"}};
    }

    @Test(dataProvider="login")
    public void loginSuccessful(String tel,String password) throws InterruptedException {

        MenuPage menuPage = new MenuPage(driver);
        menuPage.menu();
        Thread.sleep(1000);
        LoginPage loginPage =new LoginPage(driver);
        loginPage.login(tel,password);

    }
}
