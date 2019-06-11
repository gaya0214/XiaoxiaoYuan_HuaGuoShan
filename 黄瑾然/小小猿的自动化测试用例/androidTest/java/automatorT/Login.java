package automatorT;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
    private UiDevice device;

    @Test(priority = 0)
    public void login(String phoneNumber, String password) throws UiObjectNotFoundException{
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject welcome = device.findObject(new UiSelector().resourceId("tv_wel"));
        welcome.click();
        UiObject spin=device.findObject(new UiSelector().resourceId("iv_spin"));
        spin.click();
        UiObject me=device.findObject(new UiSelector().resourceId("iv_me"));
        me.click();
        if(device.findObject(new UiSelector().resourceId("btn_login")).exists()==true){
            UiObject phone=device.findObject(new UiSelector().resourceId("et_userEmailOrPhone"));
            phone.setText(phoneNumber);
            UiObject psd=device.findObject(new UiSelector().resourceId("et_userPassword"));
            psd.setText(password);
            UiObject login=device.findObject(new UiSelector().resourceId("btn_login"));
            login.click();
            Assert.assertTrue(device.findObject(new UiSelector().resourceId("iv_creat")).exists()
                    ,"登录成功，回到首页");
        }else {
            spin.click();
            UiObject home = device.findObject(new UiSelector().resourceId("iv_HomePage"));
            home.click();
        }
    }
}
