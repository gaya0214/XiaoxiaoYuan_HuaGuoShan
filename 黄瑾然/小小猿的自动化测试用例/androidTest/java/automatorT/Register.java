package automatorT;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Register {
    private UiDevice device;

    //手机注册
    @Test(priority = 0)
    public void registerWphone(String phoneNumber, String password) throws UiObjectNotFoundException {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject spin=device.findObject(new UiSelector().resourceId("iv_spin"));
        spin.click();
        UiObject me=device.findObject(new UiSelector().resourceId("iv_me"));
        me.click();
        if(device.findObject(new UiSelector().resourceId("btn_login")).exists()
                ==false){
            UiObject register=device.findObject(new UiSelector().resourceId("btn_register"));
            register.click();
            UiObject phone=device.findObject(new UiSelector().resourceId("et_userEmailOrPhone"));
            phone.setText(phoneNumber);
            UiObject psd=device.findObject(new UiSelector().resourceId("et_userPassword"));
            psd.setText(password);
            UiObject repsd=device.findObject(new UiSelector().resourceId("et_reWriteUserPassword"));
            repsd.setText(phoneNumber);
            UiObject yes=device.findObject(new UiSelector().resourceId("btn_register"));
            yes.click();
            Assert.assertTrue(device.findObject(new UiSelector().resourceId("btn_login")).exists()
                ,"注册成功，回到登录界面");
        }else{
            spin.click();
            UiObject home=device.findObject(new UiSelector().resourceId("iv_HomePage"));
            home.click();
        }
    }

    //邮箱注册
    @Test(priority = 1)
    public void registerWemail(String emailNumber, String password) throws UiObjectNotFoundException {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject spin=device.findObject(new UiSelector().resourceId("iv_spin"));
        spin.click();
        UiObject me=device.findObject(new UiSelector().resourceId("iv_me"));
        me.click();
        if(device.findObject(new UiSelector().resourceId("btn_login")).exists()
                ==false){
            UiObject register=device.findObject(new UiSelector().resourceId("btn_register"));
            register.click();
            UiObject useEmail=device.findObject(new UiSelector().resourceId("tv_emailRegister"));
            useEmail.click();
            UiObject email=device.findObject(new UiSelector().resourceId("et_userEmailOrPhone"));
            email.setText(emailNumber);
            UiObject psd=device.findObject(new UiSelector().resourceId("et_userPassword"));
            psd.setText(password);
            UiObject repsd=device.findObject(new UiSelector().resourceId("et_reWriteUserPassword"));
            repsd.setText(emailNumber);
            UiObject yes=device.findObject(new UiSelector().resourceId("btn_register"));
            yes.click();
            Assert.assertTrue(device.findObject(new UiSelector().resourceId("btn_login")).exists()
                    ,"注册成功，回到登录界面");
        }else{
            spin.click();
            UiObject home=device.findObject(new UiSelector().resourceId("iv_HomePage"));
            home.click();
        }
    }
}
