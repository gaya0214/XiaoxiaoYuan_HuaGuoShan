package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

/*3.注册-邮箱注册*/
public class Logon_mailbox extends BaseTest {
    public void logon_mailbox()throws Exception{
        Login.login();
        driver.findElementByXPath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]\n" ).click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]").click();
        driver.findElementByXPath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]\n" ).click();
        driver.findElementById( "com.google.blockly.demo:id/tv_emailRegister" ).click();
        driver.findElementById( "com.google.blockly.demo:id/et_userEmailOrPhone" ).sendKeys( "1138322644@qq.com" );
        driver.findElementById( "com.google.blockly.demo:id/et_userPassword" ).sendKeys( "123456" );
        driver.findElementById( "com.google.blockly.demo:id/et_reWriteUserPassword" ).sendKeys( "123456" );
        driver.findElementById( "com.google.blockly.demo:id/btn_right" ).click();
    }
}
