package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.CreatePage;
import pages.ClearPage;

public class ClearTest extends BasePrepare {
    @Test
    public void deleteSuccessful() throws InterruptedException {

        //清空所创作界面成功的测试
        CreatePage createPage = new CreatePage(driver);
        createPage.create();
        Thread.sleep(1000);
        ClearPage clearPage = new ClearPage(driver);
        clearPage.delete();

    }
}
