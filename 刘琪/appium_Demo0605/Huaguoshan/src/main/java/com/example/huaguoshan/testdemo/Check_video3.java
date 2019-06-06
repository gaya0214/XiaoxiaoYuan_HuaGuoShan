package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

import org.junit.Test;

/*9.查看教程视频3*/
public class Check_video3 extends BaseTest {
    @Test
    public void check_video2()throws Exception{
        Login.login();
        driver.findElementById( "com.google.blockly.demo:id/iv_tv" ).click();
        driver.findElementById( "com.google.blockly.demo:id/iv_return" ).click();
        driver.findElementById( "\tcom.google.blockly.demo:id/bt_start_pause" ).click();
    }
}
