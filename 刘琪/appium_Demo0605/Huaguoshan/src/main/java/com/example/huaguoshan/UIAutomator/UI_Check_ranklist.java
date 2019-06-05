package com.example.huaguoshan.UIAutomator;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.example.huaguoshan.testdemo.Login;

import org.junit.Test;

/*5.查看排行榜*/
public class UI_Check_ranklist {
    @Test
    private UiDevice device;
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
