package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;
import com.example.huaguoshan.testdemo.*;
/*4.查看好友榜*/
public class Check_friendlist extends BaseTest {
    public void check_friendlist()throws Exception{
        Login.login();
        driver.findElementById( "com.google.blockly.demo:id/iv_charts" ).click();
        driver.findElementById ("com.google.blockly.demo:id/fra_friends").click();

    }
}
