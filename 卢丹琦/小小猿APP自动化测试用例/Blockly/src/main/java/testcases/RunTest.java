package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.CreatePage;

import pages.RunPage;

public class RunTest extends BasePrepare {
    @Test
    public void runSuccessful() throws InterruptedException {

        //成功将组装好的模块运行的测试
        CreatePage createPage = new CreatePage(driver);
        createPage.create();
        Thread.sleep(1000);
        RunPage runPage = new RunPage(driver);
        runPage.run();

    }
}
