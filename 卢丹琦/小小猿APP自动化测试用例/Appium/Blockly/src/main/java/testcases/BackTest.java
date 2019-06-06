package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.BackPage;
import pages.CreatePage;

public class BackTest extends BasePrepare {
    @Test
    public void backSuccessful() throws InterruptedException {

        //在创作模块时返回到主界面的成功测试情况
        CreatePage createPage = new CreatePage(driver);
        createPage.create();
        Thread.sleep(1000);
        BackPage backPage = new BackPage(driver);
        backPage.back();

    }
}
