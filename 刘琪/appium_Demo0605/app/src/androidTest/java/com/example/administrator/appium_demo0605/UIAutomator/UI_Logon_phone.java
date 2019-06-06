package com.example.administrator.appium_demo0605.UIAutomator;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;
/*2.注册-手机号*/
public class UI_Logon_phone {
    private UiDevice device;
    @Test
    public  void ui_logout_phone() throws Exception{
        UI_Login.ui_login();

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        UiObject me =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_me"));
        me.click();
        UiObject btn_register =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/btn_register"));
        btn_register.click();

        UiObject tv_phoneRegister =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/tv_phoneRegister"));
        tv_phoneRegister.click();

        UiObject et_userEmailOrPhone =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_userEmailOrPhone"));
        et_userEmailOrPhone.setText( "13180686518" );

        UiObject et_userPassword =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_userEmailOrPhone"));
        et_userPassword.setText( "123456" );

        UiObject et_reWriteUserPassword =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_reWriteUserPassword"));
        et_reWriteUserPassword.setText( "123456" );

        UiObject btn_right =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/btn_right"));
        btn_right.click();

    }
}
