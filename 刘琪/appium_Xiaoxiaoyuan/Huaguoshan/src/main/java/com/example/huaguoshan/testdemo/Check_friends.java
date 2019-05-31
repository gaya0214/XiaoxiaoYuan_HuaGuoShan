package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

/*12.查看好友*/
public class Check_friends extends BaseTest {
    public void check_friends ()throws Exception{
        Login.login();
        driver.findElementByXPath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]\n" ).click();
        driver.findElementById( "et_userfriend" ).click();
    }
}
