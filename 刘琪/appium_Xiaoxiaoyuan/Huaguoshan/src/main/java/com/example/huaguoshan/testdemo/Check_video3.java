package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

/*9.查看教程视频3*/
public class Check_video3 extends BaseTest {
    public void check_video2()throws Exception{
        Login.login();
        driver.findElementById( "com.google.blockly.demo:id/iv_tv" ).click();
        driver.findElementByXPath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]\n " ).click();
        driver.findElementById( "\tcom.google.blockly.demo:id/bt_start_pause" ).click();
    }
}
