package automatorT;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Me {
    private UiDevice device;

    //修改个人信息
    @Test(priority = 0)
    public void identityTest(String userName,String birthday) throws UiObjectNotFoundException{
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject spin=device.findObject(new UiSelector().resourceId("iv_spin"));
        spin.click();
        UiObject me=device.findObject(new UiSelector().resourceId("iv_me"));
        me.click();
        UiObject uname=device.findObject(new UiSelector().resourceId("et_userName"));
        uname.setText(userName);
        UiObject ubirthday=device.findObject(new UiSelector().resourceId("et_userBirthday"));
        ubirthday.setText(birthday);
    }

    //修改头像
    @Test(priority = 1)
    public void imageTest() throws UiObjectNotFoundException{
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject spin=device.findObject(new UiSelector().resourceId("iv_spin"));
        spin.click();
        UiObject me=device.findObject(new UiSelector().resourceId("iv_me"));
        me.click();
        UiObject image=device.findObject(new UiSelector().resourceId("btn_exitUserImage"));
        image.click();
        UiObject choice=device.findObject(new UiSelector().index(1));
        choice.click();
    }

    //添加好友
    @Test(priority = 2)
    public void addFriendsTest(String friend) throws UiObjectNotFoundException{
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject spin=device.findObject(new UiSelector().resourceId("iv_spin"));
        spin.click();
        UiObject me=device.findObject(new UiSelector().resourceId("iv_me"));
        me.click();
        UiObject addfriend=device.findObject(new UiSelector().resourceId("ll_me_my_friend"));
        addfriend.click();
        UiObject add=device.findObject(new UiSelector().resourceId("et_add_friend"));
        add.setText(friend);
        Assert.assertTrue(device.findObject(new UiSelector().resourceId("tv_add_friend_warning")).exists()
                ,"发出好友请求");
    }

    //删除好友
    @Test(priority = 3)
    public void deleteFriendsTest(String friend) throws UiObjectNotFoundException{
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject spin=device.findObject(new UiSelector().resourceId("iv_spin"));
        spin.click();
        UiObject me=device.findObject(new UiSelector().resourceId("iv_me"));
        me.click();
        UiObject friendlist=device.findObject(new UiSelector().resourceId("ll_me_my_friend"));
        friendlist.click();
        UiObject add=device.findObject(new UiSelector().resourceId("btn_friend_delete"));
        add.click();
        Assert.assertFalse(device.findObject(new UiSelector().resourceId("btn_friend_delete")).exists()
                ,"删除好友");
    }

    //接收好友请求
    @Test(priority = 4)
    public void responseTest(String friend) throws UiObjectNotFoundException{
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject spin=device.findObject(new UiSelector().resourceId("iv_spin"));
        spin.click();
        UiObject me=device.findObject(new UiSelector().resourceId("iv_me"));
        me.click();
        UiObject response=device.findObject(new UiSelector().resourceId("ll_me_friend_request"));
        response.click();
        UiObject save =device.findObject(new UiSelector().resourceId("btn_friend_save"));
        save.click();
    }

}
