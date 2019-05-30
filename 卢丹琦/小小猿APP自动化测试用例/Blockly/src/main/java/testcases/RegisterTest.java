package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.MenuPage;
import pages.RegisterPage;


public class RegisterTest extends BasePrepare {
    @Test
    public void registerSuccessful() throws InterruptedException {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.menu();
        Thread.sleep(1000);
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.register("18032430902", "111111");
    }

}
