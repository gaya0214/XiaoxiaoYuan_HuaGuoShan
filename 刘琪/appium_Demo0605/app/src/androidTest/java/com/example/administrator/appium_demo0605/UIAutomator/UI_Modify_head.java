package com.example.administrator.appium_demo0605.UIAutomator;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;
/*11.修改头像*/
public class UI_Modify_head {
    private UiDevice device;
    @Test
    public  void ui_modify_information() throws Exception{
        UI_Login.ui_login();

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        UiObject me =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_me"));
        me.click();

        UiObject iv_head=device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_head"));
        iv_head.click();


    }
}
