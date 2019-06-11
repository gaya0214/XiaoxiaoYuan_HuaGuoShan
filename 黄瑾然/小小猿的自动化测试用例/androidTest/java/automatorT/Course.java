package automatorT;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Course {
    private UiDevice device;

    @Test
    public void study() throws UiObjectNotFoundException {
        device=UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject course=device.findObject(new UiSelector().resourceId("iv_tv"));
        course.click();
        device.swipe(100,100,100,500,5);
        UiObject video=device.findObject(new UiSelector().index(1));
        Assert.assertTrue(device.findObject(new UiSelector().resourceId("bt_start_pause")).exists());
        UiObject stop=device.findObject(new UiSelector().resourceId("bt_start_pause"));
    }
}
