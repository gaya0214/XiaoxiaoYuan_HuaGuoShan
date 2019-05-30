package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.MenuPage;

public class MenuTest extends BasePrepare{

    @Test
    public void menuSuccessful() throws InterruptedException {

        MenuPage menuPage = new MenuPage(driver);
        menuPage.menu();

    }
}
