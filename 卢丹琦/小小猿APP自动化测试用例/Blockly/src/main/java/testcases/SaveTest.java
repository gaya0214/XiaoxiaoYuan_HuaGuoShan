package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.CreatePage;
import pages.SavePage;

public class SaveTest extends BasePrepare {
    @Test
    public void saveSuccessful() throws InterruptedException {

        CreatePage createPage = new CreatePage(driver);
        createPage.create();
        Thread.sleep(1000);
        SavePage savePage = new SavePage(driver);
        savePage.save();

    }
}
