package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.HomePage;
import pages.LoginPage;
import pages.MenuPage;

public class HomeTest extends BasePrepare{
    @Test
    public void loginSuccessful() throws InterruptedException {

        MenuPage menuPage = new MenuPage(driver);
        menuPage.menu();
        Thread.sleep(1000);
        HomePage homePage = new HomePage(driver);
        homePage.home();

    }
}
