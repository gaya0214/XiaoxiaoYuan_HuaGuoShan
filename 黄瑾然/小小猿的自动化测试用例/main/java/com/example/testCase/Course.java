package com.example.testCase;

import com.example.base.Assertion;
import com.example.base.BaseAppium;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Course extends BaseAppium {

    //
    @Test(priority = 0)
    public void study() throws InterruptedException{
        clickView("iv_tv");
        swip("DOWN");
        clickView(findByXpath("p/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]"));
        sleep(3000);
        Assert.assertTrue(isIdElementExist("bt_start_pause"), "判断是否到了教程中");
        clickView("bt_start_pause");
    }
}
