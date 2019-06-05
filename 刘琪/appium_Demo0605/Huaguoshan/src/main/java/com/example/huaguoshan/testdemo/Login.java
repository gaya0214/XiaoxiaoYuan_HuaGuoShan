package com.example.huaguoshan.testdemo;
/*1.登录*/
import com.example.huaguoshan.base.BaseTest;

import org.junit.Test;

public class Login extends BaseTest{
    @Test
    public static void login()throws Exception{
        driver.findElementById("com.google.blockly.demo:id/ll_go");
        driver.findElementById( "com.google.blockly.demo:id/iv_me" ).click();
        driver.findElementById("com.google.blockly.demo:id/btn_register").click();
        driver.findElementById( "com.google.blockly.demo:id/et_userEmailOrPhone" ).sendKeys( "13180686518" );
        driver.findElementById( "com.google.blockly.demo:id/et_userPassword" ).sendKeys( "123456" );
        driver.findElementById( "com.google.blockly.demo:id/btn_login" ).click();
        }
}
