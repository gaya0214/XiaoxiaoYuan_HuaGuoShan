package com.example.administrator.appium_demo0605.UIAutomator;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;

/*5.查看排行榜*/
public class UI_Check_ranklist {

    protected UiDevice device;
    @Test
    public  void ui_check_ranklist() throws Exception{
        UI_Login.ui_login();

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        UiObject me =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_me"));
        me.click();

        UiObject mipmap=device.findObject(new UiSelector().resourceId("mipmap/btn_lab"));
        mipmap.click();

    }
}
