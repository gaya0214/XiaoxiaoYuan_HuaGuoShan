package com.edu.test.testxxy;

import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import org.junit.After;
import org.junit.Before;

import java.io.IOException;

public class Sen_Xxy_BaseTest {
    private UiDevice device;

    public String getDevice(){
        return device.getCurrentPackageName();
    }

    @Before
    public void StartUp()throws UiObjectNotFoundException{
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject logo = device.findObject(new UiSelector().text("小小猿"));
        logo.click();
    }

    @After
    public void shutdown()throws Exception{
        device.pressHome();
        device.executeShellCommand("am force-stop com.google.blockly.demo");
    }
}
