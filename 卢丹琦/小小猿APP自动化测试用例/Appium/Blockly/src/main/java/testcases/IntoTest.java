package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.IntoPage;

public class IntoTest extends BasePrepare{

    @Test
    public void intoSuccessful(){

        IntoPage intoPage =new IntoPage(driver);
        intoPage.into();
//        System.out.print(driver.currentActivity());
//        Assert.assertEquals(".MainActivity",driver.currentActivity());

    }
}
