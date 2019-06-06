package com.example.administrator.appium_demo0605.UIAutomator;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;
/*15.注销登录*/
public class UI_Logout_login {
    private UiDevice device;
    @Test
    public  void ui_logout_login() throws Exception{
        UI_Login.ui_login();

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        /* driver.findElementByXPath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]\n" ).click();
         */
        UiObject me =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_me"));
        me.click();


    }
}
