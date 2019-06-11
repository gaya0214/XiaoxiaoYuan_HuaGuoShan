package com.example.testCase;

import com.example.base.BaseAppium;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Go extends BaseAppium {

    //进入闯关
    @Test(priority = 0)
    public void goTest() throws InterruptedException{
        clickView("iv_arts");
        sleep(3000);
        swip("LEFT");
        swip("RIGHT");
        clickView("btn_0");
        sleep(3000);
        //显示题目
        clickView("btn_question_begin");
        sleep(300);
        Assert.assertTrue(isIdElementExist("workspace"), "判断是否进入闯关环节");
    }

    //运行workspace的代码,并判题
    @Test(priority=1)
    public void adjustTest() throws InterruptedException {
        sleep(3000);
        clickView(findByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView"));
        input(findByClassName("android.widget.EditText"), "0");
        //运行
        clickView("btn_run");
        sleep(10000);
        Assert.assertTrue(isIdElementExist("ll_flash"),"判断是否成功运行");
        //判题
        clickView("btn_adjust");
        sleep(1000);
        Assert.assertTrue(isIdElementExist("btn_dialog_jump"),"判断是否判题");
        clickView("btn_dialog_try");
    }

    //看题
    @Test(priority=2)
    public void seeQuestionTest() throws InterruptedException {
        clickView("btn_question");
        sleep(1000);
        Assert.assertTrue(isIdElementExist("/tv_see_question_content"),"判断题目是否显示");
    }

}
