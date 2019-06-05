package com.example.huaguoshan.UIAutomator;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;

import org.junit.Test;

/*16.查看我的下载*/
public class UI_Check_download {
    private UiDevice device;
    @Test
    public  void ui_check_download() throws Exception{
        UI_Login.ui_login();

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        UiObject me =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_me"));
        me.click();

        UiObject mipmap =device.findObject(new UiSelector().resourceId("mipmap/me5"));
        mipmap.click();

    }
}
