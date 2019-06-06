package com.example.administrator.appium_demo0605.UIAutomator;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;

import org.junit.Test;
/*14.查看题库*/
public class UI_Check_bank {
    private UiDevice device;
    @Test
    public  void ui_check_bank() throws Exception{
        UI_Login.ui_login();

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        UiObject me =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_me"));
        me.click();

        UiObject mipmap =device.findObject(new UiSelector().resourceId("mipmap/me4"));
        mipmap.click();

    }
}
