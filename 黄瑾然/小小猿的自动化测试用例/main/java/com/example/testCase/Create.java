package com.example.testCase;

import com.example.base.BaseAppium;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Create extends BaseAppium {
    //加入逻辑并定位到画布中央
    @Test(priority = 0)
    public void logicTest() throws InterruptedException{
        clickView("iv_creat");
        sleep(3000);
        Assert.assertTrue(isIdElementExist("workspace"),"判断是否进入创作板块");
        clickView(findByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"));
        clickView(findByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup"));
        //移动画布到中央
        clickView("_center_view_button");
    }

    //加入循环并放大画布
    @Test(priority=1)
    public void circleTest(String time) throws InterruptedException{
        clickView("iv_creat");
        sleep(3000);
        Assert.assertTrue(isIdElementExist("workspace"),"判断是否进入创作板块");
        clickView(findByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView"));
        input(findByClassName("android.widget.EditText"),time);
        //放大画布
        clickView("blockly_zoom_in_button");
    }

    //新建变量并缩小画布
    @Test(priority=2)
    public void nTest(String nName) throws InterruptedException{
        clickView("iv_creat");
        sleep(3000);
        Assert.assertTrue(isIdElementExist("workspace"),"判断是否进入创作板块");
        clickView(findByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.TextView"));
        sleep(300);
        clickView("button");
        sleep(300);
        if(isIdElementExist("name")==true){
            input(findById("name"),nName);
            clickView("button1");
            Assert.assertTrue(isIdElementExist("workspace"),"判断是否新建变量成功");
        }
        else {
            System.out.print("无法新建变量");
        }
        sleep(300);
        //缩小画布
        clickView("blockly_zoom_out_button");
    }


    //对workspace进行保存
    @Test(priority=3)
    public void saveTest() throws InterruptedException {
        clickView("iv_creat");
        sleep(3000);
        Assert.assertTrue(isIdElementExist("workspace"), "判断是否进入创作板块");
        clickView(findByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView"));
        input(findByClassName("android.widget.EditText"), "0");
        //保存
        clickView("btn_save");
        sleep(300);
        clickView("btn_return");
        sleep(3000);
        clickView("iv_creat");
    }

    //运行workspace的代码
    @Test(priority=4)
    public void runTest() throws InterruptedException {
        clickView("iv_creat");
        sleep(3000);
        Assert.assertTrue(isIdElementExist("workspace"), "判断是否进入创作板块");
        clickView(findByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView"));
        input(findByClassName("android.widget.EditText"), "0");
        //运行
        clickView("btn_run");
        sleep(10000);
        Assert.assertTrue(isIdElementExist("ll_flash"),"判断是否成功运行");
    }

    //清空workspace的代码
    @Test(priority=5)
    public void cleanTest() throws InterruptedException {
        clickView("iv_creat");
        sleep(3000);
        Assert.assertTrue(isIdElementExist("workspace"), "判断是否进入创作板块");
        clickView(findByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView"));
        input(findByClassName("android.widget.EditText"), "0");
        //清空
        clickView("btn_clear");
        sleep(10000);
        Assert.assertTrue(isElementExist(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView"),10),"判断是否成功清空");

    }

}
