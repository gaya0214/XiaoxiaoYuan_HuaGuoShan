package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.MagnifyPage;
import pages.CreatePage;

public class MagnifyTest extends BasePrepare{
    @Test
    public void deleteSuccessful() throws InterruptedException {

        //成功在create界面创作时放大界面的测试
        CreatePage createPage = new CreatePage(driver);
        createPage.create();
        Thread.sleep(1000);
        MagnifyPage magnifyPage = new MagnifyPage(driver);
        magnifyPage.magnify();

    }
}
