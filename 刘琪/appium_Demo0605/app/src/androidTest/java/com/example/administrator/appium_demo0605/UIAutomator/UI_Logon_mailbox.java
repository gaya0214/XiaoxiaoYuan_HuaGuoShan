package com.example.administrator.appium_demo0605.UIAutomator;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;

/*3.注册-邮箱注册*/
public class UI_Logon_mailbox {
    private UiDevice device;
    @Test
    public  void ui_logon_mailbox() throws Exception{
        UI_Login.ui_login();

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        UiObject me =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_me"));
        me.click();

        UiObject btn_register =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/btn_register"));
        btn_register.click();

        UiObject tv_emailRegister =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/tv_emailRegister"));
        tv_emailRegister.click();

        UiObject et_userEmailOrPhone =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_userEmailOrPhone"));
        et_userEmailOrPhone.setText( "1138322644@qq.com" );

        UiObject et_userPassword =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_userPassword"));
        et_userPassword.setText( "123456" );

        UiObject et_reWriteuserPassword =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_reWriteuserPassword"));
        et_reWriteuserPassword.setText( "123456" );

        UiObject btn_right =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/btn_right"));
        btn_right.click();
    }
}
