package testcases;


import org.testng.annotations.Test;

import base.BasePrepare;
import pages.LoginPage;
import pages.MenuPage;

public class LoginPageTest extends BasePrepare{

    @Test
    public void loginSuccessful() throws InterruptedException {

        MenuPage menuPage = new MenuPage(driver);
        menuPage.menu();
        Thread.sleep(1000);
        LoginPage loginPage =new LoginPage(driver);
        loginPage.login("18032430901","111111");

    }
}
