package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

/*19.创作一个代码-保存*/
public class Creation_demo2 extends BaseTest {
    public void creation_demo2()throws Exception{
        Login.login();
        driver.findElementById( "com.google.blockly.demo:id/iv_creat" ).click();
        driver.findElementByXPath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView\n" ).click();
        driver.findElementByXPath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget." +
                "EditText\n" ).sendKeys( "打印输出demo" );
        driver.findElementById( "\tcom.google.blockly.demo:id/workspace" ).click();
    }
}
