package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

/*7.查看教程视频1*/
public class Check_video1 extends BaseTest {
    public void check_video1()throws Exception{
        Login.login();
        driver.findElementById( "com.google.blockly.demo:id/iv_tv" ).click();
        driver.findElementByXPath( "\t/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.TextView[2]\n" +
                "\n" +
                "Using XPath locators is not recommended and can " ).click();
        driver.findElementById( "\tcom.google.blockly.demo:id/bt_start_pause" ).click();
    }
}
