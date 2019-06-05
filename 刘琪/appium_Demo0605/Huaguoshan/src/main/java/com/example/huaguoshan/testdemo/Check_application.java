package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

import org.junit.Test;
import org.testng.annotations.Parameters;

/*13.查看好友申请*/

public class Check_application extends BaseTest{
    @Test
    public void check_application ()throws Exception{
        Login.login();
        driver.findElementById( "com.google.blockly.demo:id/iv_me" ).click();
        driver.findElementById( "ll_me_friend_request" ).click();
    }
}
