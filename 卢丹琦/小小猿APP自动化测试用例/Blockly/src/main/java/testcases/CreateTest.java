package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.CreatePage;

public class CreateTest extends BasePrepare{

    @Test
    public void createsuccess() throws InterruptedException {

        CreatePage createPage = new CreatePage(driver);
        createPage.create();

    }
}
