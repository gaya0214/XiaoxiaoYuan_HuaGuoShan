package cn.edu.hebtu.software.appium.uiautomator;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;

public class Rank {
    private UiDevice device;
    @Test
    public void ranksuccessful() throws UiObjectNotFoundException, InterruptedException {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject into = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/ll_go"));
        into.click();
        Thread.sleep(1000);
        UiObject menu = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_spin"));
        menu.click();

        Thread.sleep(1000);
        UiObject list = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_charts"));
        list.click();
        Thread.sleep(1000);
        UiObject friend = device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/fra_friends"));
        friend.click();
    }
}
