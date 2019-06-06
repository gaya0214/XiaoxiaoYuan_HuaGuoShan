package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.CreatePage;
import pages.MagnifyPage;
import pages.ResetPage;

public class ResetTest extends BasePrepare {
    @Test
    public void deleteSuccessful() throws InterruptedException {

        //成功将已经布置好的模块删除的测试
        CreatePage createPage = new CreatePage(driver);
        createPage.create();
        Thread.sleep(1000);
        ResetPage resetPage = new ResetPage(driver);
        resetPage.reset();

    }
}
