package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

/*16.调节是否打开开关*/
public class Check_download extends BaseTest {
    public void check_download()throws Exception{
        Login.login();
        driver.findElementById( "com..google.blockly.demo:id/iv_setting" ).click();
        driver.findElementById( "com..google.blockly.demo:id/iv_setting" ).click();
    }
}
