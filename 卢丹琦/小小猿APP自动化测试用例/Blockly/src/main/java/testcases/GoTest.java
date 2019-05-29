package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.GoPage;
import pages.LoginPage;
import pages.MenuPage;

public class GoTest extends BasePrepare{
    @Test
    public void goSuccessful() throws InterruptedException {

        MenuPage menuPage = new MenuPage(driver);
        menuPage.menu();
        Thread.sleep(1000);
        LoginPage loginPage =new LoginPage(driver);
        loginPage.login("18032430901","111111");
        GoPage goPage = new GoPage(driver);
        goPage.go();

    }
}
