package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

/*5.查看排行榜*/
public class Check_ranklist extends BaseTest {
    public void check_ranklist()throws  Exception{
        Login.login();
        driver.findElementById( "com.google.blockly.demo:id/iv_charts" ).click();
        driver.findElementById( "com.google.blockly.demo:id/fra_labber" ).click();
    }
}
