package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.CreatePage;
import pages.SavePage;

public class SaveTest extends BasePrepare {
    @Test
    public void saveSuccessful() throws InterruptedException {

        //成功将组装好的模块保存的测试
        CreatePage createPage = new CreatePage(driver);
        createPage.create();
        Thread.sleep(1000);
        SavePage savePage = new SavePage(driver);
        savePage.save();

    }
}
