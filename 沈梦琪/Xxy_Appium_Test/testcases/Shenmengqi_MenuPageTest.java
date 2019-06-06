package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.MenuPage;

public class MenuPageTest extends BaseTest {

    @Test
    public void index(){
        MenuPage menuPage = new MenuPage(getDriver());
        menuPage.index();
        System.out.println(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.HomePage",getDriver().currentActivity());
    }

    @Test
    public void charts(){
        MenuPage menuPage = new MenuPage(getDriver());
        menuPage.charts();
        System.out.println(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.RankActivity",getDriver().currentActivity());
    }

    @Test
    public void mine(){
        MenuPage menuPage = new MenuPage(getDriver());
        menuPage.mine();
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.LoginActivity",getDriver().currentActivity());
    }

    @Test(description = "mute")
    public void mute(){
        MenuPage menuPage = new MenuPage(getDriver());
        menuPage.mute();
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.HomePage",getDriver().currentActivity());
    }
}
