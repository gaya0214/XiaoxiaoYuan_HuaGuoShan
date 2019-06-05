package com.example.huaguoshan.UIAutomator;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;

import org.junit.Test;
/*9.查看教程视频3*/
public class UI_Check_video3 {
    private UiDevice device;
    @Test
    public  void ui_check_video3() throws Exception{
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
