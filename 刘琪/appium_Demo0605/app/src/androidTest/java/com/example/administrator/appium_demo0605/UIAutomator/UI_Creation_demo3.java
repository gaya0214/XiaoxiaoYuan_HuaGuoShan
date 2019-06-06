package com.example.administrator.appium_demo0605.UIAutomator;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;
/*20.创作一个代码-点击运行*/
public class UI_Creation_demo3 {
    private UiDevice device;
    @Test
    public  void ui_creation_demo2() throws Exception{
        UI_Login.ui_login();

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        UiObject iv_creat =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_creat"));
        iv_creat.click();


        UiObject workspace=device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/workspace"));
        workspace.click();

    }
}
