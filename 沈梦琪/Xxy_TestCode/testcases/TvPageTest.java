package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.TvPage;

public class TvPageTest extends BaseTest {
    @Test
    public void playlist(){
        new TvPage(getDriver());
        System.out.println(getDriver().currentActivity());
        Assert.assertEquals("",getDriver().currentActivity());
    }

    @Test
    public void play(){
        TvPage tvPage = new TvPage(getDriver());
        tvPage.play(1);
        System.out.println(getDriver().currentActivity());
        Assert.assertEquals("",getDriver().currentActivity());
    }

    @Test
    public void pause(){
        TvPage tvPage = new TvPage(getDriver());
        tvPage.pause();
        System.out.println(getDriver().currentActivity());
        Assert.assertEquals("",getDriver().currentActivity());
    }
}
