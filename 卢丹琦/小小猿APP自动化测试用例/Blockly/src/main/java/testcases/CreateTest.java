package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.CreatePage;

public class CreateTest extends BasePrepare{

    @Test
    public void createsuccess() throws InterruptedException {

        //成功进入create版块的测试
        CreatePage createPage = new CreatePage(driver);
        createPage.create();

    }
}
