package com.example.testCase;

import com.example.base.BaseAppium;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RankList extends BaseAppium {

    //查看天梯榜
    @Test(priority = 0)
    public void labberList() throws InterruptedException{
        clickView("iv_spin");
        clickView("iv_charts");
        clickView("fra_labber");
        swip("UP");
        Assert.assertTrue(isIdElementExist("lra_addfriends"), "判断是否进入天梯榜");
    }

    //查看好友榜
    @Test(priority = 1)
    public void friendsList() throws InterruptedException{
        clickView("iv_spin");
        clickView("iv_charts");
        clickView("fra_friends");
        swip("UP");
        Assert.assertTrue(isIdElementExist("fra_friends"), "判断是否进入好友榜");
    }
}
