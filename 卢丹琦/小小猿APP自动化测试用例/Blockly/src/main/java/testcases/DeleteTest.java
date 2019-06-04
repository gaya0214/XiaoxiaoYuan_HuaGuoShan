package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.CreatePage;
import pages.DeletePage;

public class DeleteTest extends BasePrepare{
    @Test
    public void deleteSuccessful() throws InterruptedException {

        //成功删除所插入版块的测试
        CreatePage createPage = new CreatePage(driver);
        createPage.create();
        Thread.sleep(1000);
        DeletePage deletePage = new DeletePage(driver);
        deletePage.delete();

    }
}
