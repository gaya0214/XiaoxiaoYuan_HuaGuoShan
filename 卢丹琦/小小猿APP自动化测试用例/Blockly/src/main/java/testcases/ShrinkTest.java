package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.CreatePage;
import pages.MagnifyPage;
import pages.ShrinkPage;

public class ShrinkTest extends BasePrepare {
    @Test
    public void deleteSuccessful() throws InterruptedException {

        //成功在create界面创作时缩小界面的测试
        CreatePage createPage = new CreatePage(driver);
        createPage.create();
        Thread.sleep(1000);
        ShrinkPage shrinkPage = new ShrinkPage(driver);
        shrinkPage.shrink();

    }
}
