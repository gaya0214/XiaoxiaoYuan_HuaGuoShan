package com.example.testCase;

import com.example.base.BaseAppium;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Me extends BaseAppium {

    //修改个人信息
    @Test(priority = 0)
    public void identityTest(String userName,String birthday) throws InterruptedException{
        clickView("iv_spin");
        clickView("iv_me");
        sleep(3000);
        input(findById("et_userName"),userName);
        input(findById("et_userBirthday"),birthday);
    }

    //修改头像
    @Test(priority = 1)
    public void imageTest() throws InterruptedException{
        clickView("iv_spin");
        clickView("iv_me");
        sleep(3000);
        clickView("btn_exitUserImage");
        sleep(1000);
        clickView(findByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView"));
        sleep(10000);
    }

    //添加好友
    @Test(priority = 2)
    public void addFriendsTest(String friend) throws InterruptedException{
        clickView("iv_spin");
        clickView("iv_me");
        clickView("ll_me_my_friend");
        input(findById("et_add_friend"),friend);
        sleep(3000);
        Assert.assertTrue(isIdElementExist("tv_add_friend_warning"),"判断是否向好友发出请求");
    }

    //删除好友
    @Test(priority = 3)
    public void deleteFriendsTest(String friend) throws InterruptedException{
        clickView("iv_spin");
        clickView("iv_me");
        clickView("id=ll_me_my_friend");
        clickView("btn_friend_delete");
        sleep(3000);
        Assert.assertFalse(isIdElementExist("btn_friend_delete"),"判断是否成功删除好友");
    }

    //接收好友请求
    @Test(priority = 4)
    public void responseTest(String friend) throws InterruptedException{
        clickView("iv_spin");
        clickView("iv_me");
        clickView("id=ll_me_friend_request");
        sleep(300);
        clickView("btn_friend_save");
    }

}
