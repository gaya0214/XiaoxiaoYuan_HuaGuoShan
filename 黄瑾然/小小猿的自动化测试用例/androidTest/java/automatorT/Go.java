package automatorT;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Go {
    private UiDevice device;

    @Test(priority = 0)
    public void goTest() throws UiObjectNotFoundException{
        device=UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject go=device.findObject(new UiSelector().resourceId("iv_arts"));
        go.click();
        device.swipe(1814,570,1814,429,5);
        device.swipe(1814,429,1814,570,5);
        UiObject in=device.findObject(new UiSelector().resourceId("btn_0"));
        in.click();
        UiObject start=device.findObject(new UiSelector().resourceId("btn_question_begin"));
        start.click();
        Assert.assertTrue(device.findObject(new UiSelector().resourceId("workspace")).exists(),"进入闯关模式");
    }

    //运行workspace的代码,并判题
    @Test(priority=1)
    public void adjustTest() throws UiObjectNotFoundException{
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject create = device.findObject(new UiSelector().resourceId("iv_creat"));
        create.click();
        Assert.assertTrue(device.findObject(new UiSelector().resourceId("workspace")).exists());
        UiObject logic = device.findObject(new UiSelector().text("逻辑"));
        logic.click();
        UiObject nif = device.findObject(new UiSelector().text("如果"));
        nif.dragTo(1306, 254, 10);
        UiObject run=device.findObject(new UiSelector().resourceId("btn_run"));
        run.click();
        Assert.assertTrue(device.findObject(new UiSelector().resourceId("ll_flash")).exists()
                , "判断是否成功运行");
        UiObject adjust=device.findObject(new UiSelector().resourceId("btn_adjust"));
        adjust.click();
        Assert.assertTrue(device.findObject(new UiSelector().resourceId("btn_dialog_jump")).exists(),"判题成功");
    }

    //看题
    @Test(priority=2)
    public void seeQuestionTest() throws UiObjectNotFoundException {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject create = device.findObject(new UiSelector().resourceId("iv_creat"));
        create.click();
        Assert.assertTrue(device.findObject(new UiSelector().resourceId("workspace")).exists());
        UiObject see=device.findObject(new UiSelector().resourceId("btn_question"));
        see.click();
        Assert.assertTrue(device.findObject(new UiSelector().resourceId("/tv_see_question_content")).exists(),"题目显示成功");
    }
}
