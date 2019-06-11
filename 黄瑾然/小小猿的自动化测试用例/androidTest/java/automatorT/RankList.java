package automatorT;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RankList {
    private UiDevice device;

    //查看天梯榜
    @Test(priority = 0)
    public void labberList() throws UiObjectNotFoundException{
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject spin=device.findObject(new UiSelector().resourceId("iv_spin"));
        spin.click();
        UiObject charts=device.findObject(new UiSelector().resourceId("iv_charts"));
        charts.click();
        UiObject labber=device.findObject(new UiSelector().resourceId("fra_labber"));
        labber.click();
        device.swipe(1183,1026,1183,184,5);
        Assert.assertTrue(device.findObject(new UiSelector().resourceId("lra_addfriends")).exists()
                ,"进入天梯榜");
    }

    //查看好友榜
    @Test(priority = 1)
    public void friendsList() throws UiObjectNotFoundException{
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject spin=device.findObject(new UiSelector().resourceId("iv_spin"));
        spin.click();
        UiObject charts=device.findObject(new UiSelector().resourceId("iv_charts"));
        charts.click();
        UiObject friends=device.findObject(new UiSelector().resourceId("fra_friends"));
        friends.click();
    }
}
