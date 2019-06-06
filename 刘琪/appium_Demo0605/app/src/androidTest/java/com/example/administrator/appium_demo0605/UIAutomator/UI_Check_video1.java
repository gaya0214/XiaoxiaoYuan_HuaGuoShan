package com.example.administrator.appium_demo0605.UIAutomator;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;

/*7.查看教程视频1*/
public class UI_Check_video1 {
    private UiDevice device;
    @Test
    public  void ui_check_video1() throws Exception{
        UI_Login.ui_login();

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        UiObject tv =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_tv"));
        tv.click();

        UiObject iv_return=device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_return"));
        iv_return.click();

        UiObject bt_start_pause=device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/bt_start_pause"));
        bt_start_pause.click();

    }
}
