package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

import org.junit.Test;

/*10.修改个人信息*/
public class Modify_information extends BaseTest {
    @Test
    public void modify_information()throws Exception{
        Login.login();
        driver.findElementById( "com.google.blockly.demo:id/iv_me" ).click();
        driver.findElementById( "et_username" ).sendKeys( "gaya" );
        driver.findElementById( "et_userSex" ).sendKeys( "女" );
        driver.findElementById( "et_userPhone" ).sendKeys( "13180686518" );
        driver.findElementById( "et_userBirthday" ).sendKeys( "1998-02-14" );
    }
}
