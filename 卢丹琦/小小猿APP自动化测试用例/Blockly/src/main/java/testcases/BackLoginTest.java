package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.BackLoginPage;
import pages.LoginPage;
import pages.MenuPage;

public class BackLoginTest extends BasePrepare{
    @Test
    public void BackLoginSuccessful() throws InterruptedException {

        MenuPage menuPage = new MenuPage(driver);
        menuPage.menu();
        Thread.sleep(1000);
        BackLoginPage backLoginPage =new BackLoginPage(driver);
        backLoginPage.backlogin("18032430901","111111");

    }
}
