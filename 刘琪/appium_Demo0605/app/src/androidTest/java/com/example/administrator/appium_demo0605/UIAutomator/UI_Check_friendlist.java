package com.example.administrator.appium_demo0605.UIAutomator;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;
/*4.查看好友榜*/
public class UI_Check_friendlist {
    private UiDevice device;
    @Test
    public  void ui_check_friendlist() throws Exception{
        UI_Login.ui_login();

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        UiObject iv_charts =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_charts"));
        iv_charts.click();

        UiObject mipmap=device.findObject(new UiSelector().resourceId("mipmap/btn_fra1"));
        mipmap.click();

    }
}
