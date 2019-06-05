package com.example.huaguoshan.UIAutomator;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;

import org.junit.Test;
/*13.查看好友申请*/
public class UI_Check_application {
    private UiDevice device;
    @Test
    public  void ui_check_application() throws Exception{
        UI_Login.ui_login();

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        UiObject me =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_me"));
        me.click();

        UiObject ll_me_friend_request=device.findObject(new UiSelector().resourceId("ll_me_friend_request"));
        ll_me_friend_request.click();

    }
}
