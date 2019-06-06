package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.GoPage;

public class GoPageTest extends BaseTest {

    private String usename = "15226520862";
    private String usepwd = "123456";

    @Test
    public void go_without_login(){
        GoPage goPage = new GoPage(getDriver());
        System.out.println(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.HomePage",getDriver().currentActivity());
    }

    @Test(description = "Go_into_Gopage")
    public void question(){
        GoPage goPage = new GoPage(getDriver(),usename,usepwd);
        System.out.println(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.HomePage",getDriver().currentActivity());
    }

    @Test(description = "Question_ForSure")
    public void forsure(){
        GoPage goPage = new GoPage(getDriver(),usename,usepwd);
        goPage.forsure(1);
        System.out.println(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.RunActivity",getDriver().currentActivity());
    }

    @Test(description = "Question_Begin")
    public void begin(){
        GoPage goPage = new GoPage(getDriver(),usename,usepwd);
        goPage.question_begin(1);
        System.out.println(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.AdjustActivity",getDriver().currentActivity());
    }

    @Test(description = "Question_Cancle")
    public void cancle(){
        GoPage goPage = new GoPage(getDriver(),usename,usepwd);
        goPage.question_cancle(1);
        System.out.println(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.RunActivity",getDriver().currentActivity());
    }

    @Test(description = "back_to_index")
    public void backtoindex(){
        GoPage goPage = new GoPage(getDriver(),usename,usepwd);
        goPage.btindex();
        System.out.println(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.HomePage",getDriver().currentActivity());
    }

    @Test(description = "next_page")
    public void next(){
        GoPage goPage = new GoPage(getDriver(),usename,usepwd);
        goPage.next_page();
        System.out.println(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.RunActivity",getDriver().currentActivity());
    }
    @Test(description = "pre_page")
    public void pre(){
        GoPage goPage = new GoPage(getDriver(),usename,usepwd);
        goPage.next_page();
        goPage.pre_page();
        System.out.println(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.RunActivity",getDriver().currentActivity());
    }

}
