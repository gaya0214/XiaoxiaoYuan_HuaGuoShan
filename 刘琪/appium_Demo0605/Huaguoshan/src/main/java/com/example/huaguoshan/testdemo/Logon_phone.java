package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

import org.junit.Test;

/*2.注册-手机号*/
public class Logon_phone extends BaseTest {
    @Test
    public void logon_phone()throws Exception{
        Login.login();
        driver.findElementById( "com.google.blockly.demo:id/iv_me" ).click();
        driver.findElementById("com.google.blockly.demo:id/btn_register").click();
        driver.findElementById( "com.google.blockly.demo:id/tv_phoneRegister" ).click();
        driver.findElementById( "com.google.blockly.demo:id/et_userEmailOrPhone" ).sendKeys( "13180686518" );
        driver.findElementById( "com.google.blockly.demo:id/et_userPassword" ).sendKeys( "123456" );
        driver.findElementById( "com.google.blockly.demo:id/et_reWriteUserPassword" ).sendKeys( "123456" );
        driver.findElementById( "com.google.blockly.demo:id/btn_register" ).click();
    }
}
