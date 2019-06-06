package cn.edu.hebtu.software.appium.uiautomator;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;

public class Login {
    private UiDevice device;
    @Test
    public void loginsuccessful() throws UiObjectNotFoundException, InterruptedException {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject into = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/ll_go"));
        into.click();
        Thread.sleep(1000);
        UiObject menu = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_spin"));
        menu.click();

        Thread.sleep(1000);

        UiObject me = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_me"));
        me.click();
        Thread.sleep(1000);
        UiObject name = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_userEmailOrPhone"));
        name.setText("18032430901");
        UiObject password = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_userPassword"));
        password.setText("111111");
        UiObject submit = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/btn_login"));
        submit.click();
    }
}
