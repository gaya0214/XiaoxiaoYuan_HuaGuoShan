package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

import org.junit.Test;

/*14.查看题库*/
public class Check_bank extends BaseTest{
    @Test
    public void check_bank()throws Exception{
        Login.login();
        driver.findElementById( "com.google.blockly.demo:id/iv_me" ).click();
        driver.findElementById( "mipmap/me4" ).click();
    }
}
