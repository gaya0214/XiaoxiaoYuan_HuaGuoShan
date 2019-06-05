package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

import org.junit.Test;

/*3.注册-邮箱注册*/
public class Logon_mailbox extends BaseTest {
    @Test
    public void logon_mailbox()throws Exception{
        driver.findElementById( "com.google.blockly.demo:id/iv_me" ).click();
        driver.findElementById("com.google.blockly.demo:id/btn_register").click();

        driver.findElementById( "com.google.blockly.demo:id/tv_emailRegister" ).click();
        driver.findElementById( "com.google.blockly.demo:id/et_userEmailOrPhone" ).sendKeys( "1138322644@qq.com" );
        driver.findElementById( "com.google.blockly.demo:id/et_userPassword" ).sendKeys( "123456" );
        driver.findElementById( "com.google.blockly.demo:id/et_reWriteUserPassword" ).sendKeys( "123456" );
        driver.findElementById( "com.google.blockly.demo:id/btn_right" ).click();
    }
}
