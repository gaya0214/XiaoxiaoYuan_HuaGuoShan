package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

/*14.查看题库*/
public class Check_bank extends BaseTest{
    public void check_bank()throws Exception{
        Login.login();
        driver.findElementByXPath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]\n" ).click();
        driver.findElementById( "et_itemblank" ).click();
    }
}
