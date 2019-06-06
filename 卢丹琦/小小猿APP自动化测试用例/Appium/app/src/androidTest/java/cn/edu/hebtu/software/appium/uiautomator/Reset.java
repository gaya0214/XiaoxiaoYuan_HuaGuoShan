package cn.edu.hebtu.software.appium.uiautomator;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;

public class Reset {
    private UiDevice device;
    @Test
    public void resetsuccessful() throws UiObjectNotFoundException, InterruptedException {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject into = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/ll_go"));
        into.click();
        Thread.sleep(1000);
        UiObject create = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_creat"));
        create.click();

        Thread.sleep(1000);
        UiObject reset = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/blockly_center_view_button"));
        reset.click();
    }
}
