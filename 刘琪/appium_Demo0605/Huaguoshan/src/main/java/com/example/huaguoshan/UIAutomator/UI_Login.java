package com.example.huaguoshan.UIAutomator;


import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;

import org.junit.Test;
/*1.登录*/
public class UI_Login {

	    @Test
	    public static void ui_login() throws Exception{
			UiDevice device;
	    	device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
	        device.pressHome();
	        UiObject logo = device.findObject(new UiSelector().text("Xiaoxiaoyuan"));
	        logo.click();

	        UiObject name =device.findObject(new UiSelector().resourceId("com.example.todolist:id/nameET"));
			name.click();

			UiObject me =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_me"));
	        me.click();

	        UiObject btn_register =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/btn_register"));
			btn_register.click();

	        UiObject et_userEmailOrPhone =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_userEmailOrPhone"));
			et_userEmailOrPhone.setText( "13180686518" );

			UiObject et_userPassword =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_userPassword"));
			et_userPassword.setText( "123456" );

			UiObject btn_login =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/btn_login"));
			btn_login.click();
		}

}
