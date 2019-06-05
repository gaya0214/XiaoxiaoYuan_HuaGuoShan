package com.example.huaguoshan.UIAutomator;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;

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
