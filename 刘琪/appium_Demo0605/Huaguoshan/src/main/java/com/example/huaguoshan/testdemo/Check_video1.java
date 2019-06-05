package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

import org.junit.Test;

/*7.查看教程视频1*/
public class Check_video1 extends BaseTest {
    @Test
    public void check_video1()throws Exception{
        Login.login();
        driver.findElementById( "com.google.blockly.demo:id/iv_tv" ).click();
        driver.findElementById( "com.google.blockly.demo:id/iv_return" ).click();
        driver.findElementById( "com.google.blockly.demo:id/bt_start_pause" ).click();
    }
}
