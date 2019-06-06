package com.example.administrator.appium_demo0605.UIAutomator;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;
/*17.开始闯关*/
public class UI_Start_breakingthrough {
	 private UiDevice device;

	    @Test
	    public  void ui_start_breakingthrough() throws Exception{
            UI_Login.ui_login();
            device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

            UiObject iv_arts=device.findObject(new UiSelector().resourceId("\tcom.google.blockly.demo:id/iv_arts"));
            iv_arts.click();

            UiObject btn_0 =device.findObject(new UiSelector().resourceId("\tcom.google.blockly.demo:id/btn_0"));
            btn_0.click();

            UiObject btn_question_begin =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/btn_question_begin"));
            btn_question_begin.setText( "abc" );

            UiObject workplace =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/workspace"));
            workplace.click();
	    }

}
