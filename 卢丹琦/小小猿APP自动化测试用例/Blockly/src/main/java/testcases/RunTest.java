package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.CreatePage;

import pages.RunPage;

public class RunTest extends BasePrepare {
    @Test
    public void runSuccessful() throws InterruptedException {

        CreatePage createPage = new CreatePage(driver);
        createPage.create();
        Thread.sleep(1000);
        RunPage runPage = new RunPage(driver);
        runPage.run();

    }
}
