package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.BackPage;
import pages.CreatePage;

public class BackTest extends BasePrepare {
    @Test
    public void backSuccessful() throws InterruptedException {

        CreatePage createPage = new CreatePage(driver);
        createPage.create();
        Thread.sleep(1000);
        BackPage backPage = new BackPage(driver);
        backPage.back();

    }
}
