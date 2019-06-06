package com.example.administrator.appium_demo0605.UIAutomator;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;
/*10.修改个人信息*/
public class UI_Modify_information {
    private UiDevice device;
    @Test
    public  void ui_modify_information() throws Exception{
        UI_Login.ui_login();

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        UiObject me =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_me"));
        me.click();

        UiObject et_username=device.findObject(new UiSelector().resourceId("et_username"));
        et_username.setText( "gaya" );

        UiObject et_userSex=device.findObject(new UiSelector().resourceId("et_username"));
        et_userSex.setText( "女" );

        UiObject et_userPhone=device.findObject(new UiSelector().resourceId("et_username"));
        et_userPhone.setText( "13180686518" );

        UiObject et_userBirthday=device.findObject(new UiSelector().resourceId("et_username"));
        et_userBirthday.setText( "1998-02-14" );

    }

}

