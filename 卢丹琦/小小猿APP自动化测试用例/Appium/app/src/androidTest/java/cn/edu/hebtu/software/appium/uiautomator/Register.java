package cn.edu.hebtu.software.appium.uiautomator;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;

public class Register {
    private UiDevice device;
    @Test
    public void registersuccessful() throws UiObjectNotFoundException, InterruptedException {
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
        UiObject register = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_me"));
        register.click();
        Thread.sleep(1000);
        UiObject name = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_userEmailOrPhone"));
        name.setText("18032430902");
        UiObject password = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_userPassword"));
        password.setText("1111111");
        UiObject repassword = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_reWriteUserPassword"));
        repassword.setText("1111111");
        register.click();

    }
}
