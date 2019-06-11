package automatorT;

import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Create{
    private UiDevice device;

    //加入逻辑并定位到画布中央
    @Test(priority = 0)
    public void logicTest() throws UiObjectNotFoundException {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject create = device.findObject(new UiSelector().resourceId("iv_creat"));
        create.click();
        Assert.assertTrue(device.findObject(new UiSelector().resourceId("workspace")).exists());
        UiObject logic = device.findObject(new UiSelector().text("逻辑"));
        logic.click();
        UiObject nif = device.findObject(new UiSelector().text("如果"));
        nif.dragTo(1306, 254, 10);
        UiObject certen = device.findObject(new UiSelector().resourceId("_center_view_button"));
        certen.click();
    }

    //加入循环并放大画布
    @Test(priority=1)
    public void circleTest(String time) throws UiObjectNotFoundException{
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject create = device.findObject(new UiSelector().resourceId("iv_creat"));
        create.click();
        Assert.assertTrue(device.findObject(new UiSelector().resourceId("workspace")).exists());
        UiObject circle = device.findObject(new UiSelector().text("循环"));
        circle.click();
        UiObject nfor = device.findObject(new UiSelector().text("重复"));
        nfor.dragTo(1288, 230, 10);
        UiObject zoomIn = device.findObject(new UiSelector().resourceId("blockly_zoom_in_button"));
        zoomIn.click();
    }

    //新建变量并缩小画布
    @Test(priority=2)
    public void nTest(String nName) throws UiObjectNotFoundException{
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject create = device.findObject(new UiSelector().resourceId("iv_creat"));
        create.click();
        Assert.assertTrue(device.findObject(new UiSelector().resourceId("workspace")).exists());
        UiObject nX = device.findObject(new UiSelector().text("变量"));
        nX.click();
        UiObject newX = device.findObject(new UiSelector().text("新建变量"));
        newX.click();
        if(device.findObject(new UiSelector().resourceId("name")).exists()==true){
            UiObject name=device.findObject(new UiSelector().resourceId("name"));
            name.setText(nName);
            UiObject yes=device.findObject(new UiSelector().resourceId("button1"));
            yes.click();
            Assert.assertTrue(device.findObject(new UiSelector().resourceId("workspace")).exists()
                    , "新建变量成功");
        }
        else {
            System.out.print("无法新建变量");
        }
        UiObject zoomOut = device.findObject(new UiSelector().resourceId("blockly_zoom_out_button"));
        zoomOut.click();
    }

    //对workspace进行保存
    @Test(priority=3)
    public void saveTest() throws UiObjectNotFoundException{
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject create = device.findObject(new UiSelector().resourceId("iv_creat"));
        create.click();
        Assert.assertTrue(device.findObject(new UiSelector().resourceId("workspace")).exists());
        UiObject save=device.findObject(new UiSelector().resourceId("btn_save"));
        save.click();
    }

    //运行workspace的代码
    @Test(priority=4)
    public void runTest() throws UiObjectNotFoundException{
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject create = device.findObject(new UiSelector().resourceId("iv_creat"));
        create.click();
        Assert.assertTrue(device.findObject(new UiSelector().resourceId("workspace")).exists());
        UiObject run=device.findObject(new UiSelector().resourceId("btn_run"));
        run.click();
        Assert.assertTrue(device.findObject(new UiSelector().resourceId("ll_flash")).exists()
                , "判断是否成功运行");
    }

    //清空workspace的代码
    @Test(priority=5)
    public void cleanTest() throws UiObjectNotFoundException{
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        UiObject create = device.findObject(new UiSelector().resourceId("iv_creat"));
        create.click();
        Assert.assertTrue(device.findObject(new UiSelector().resourceId("workspace")).exists());
        UiObject clear=device.findObject(new UiSelector().resourceId("btn_clear"));
        clear.click();
        Assert.assertTrue(device.findObject(new UiSelector().text("如果")).exists(),"判断是否成功清空");
    }
}
