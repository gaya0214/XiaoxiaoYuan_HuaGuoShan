package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CreatePage;

public class CreatePageTest extends BaseTest {
    @Test(description = "CreatePage")
    public void CreatePage(){
        CreatePage createPage = new CreatePage(getDriver());
        System.out.println(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.HomePage",getDriver().currentActivity());
    }
}
