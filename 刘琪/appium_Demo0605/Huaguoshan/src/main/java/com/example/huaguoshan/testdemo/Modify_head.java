package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

import org.junit.Test;

/*11.修改头像*/
public class Modify_head extends BaseTest {
    @Test
    public void modify_head()throws Exception{
        Login.login();
        driver.findElementById( "com.google.blockly.demo:id/iv_me" ).click();
        driver.findElementById("com.google.blockly.demo:id/iv_head").click();
    }
}
