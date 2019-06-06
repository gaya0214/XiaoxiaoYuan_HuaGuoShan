package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

import org.junit.Test;

/*16.查看我的下载*/
public class Check_download extends BaseTest {
    @Test
    public void check_download()throws Exception{
        Login.login();
        driver.findElementById( "com.google.blockly.demo:id/iv_me" ).click();
        driver.findElementById( "mipmap/me5" ).click();
    }
}
