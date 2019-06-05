package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

/*11.修改头像*/
public class Modify_head extends BaseTest {
    public void modify_head()throws Exception{
        Login.login();
        driver.findElementByXPath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]\n" ).click();
        driver.findElementById( "et_userhead" ).click();
    }
}
