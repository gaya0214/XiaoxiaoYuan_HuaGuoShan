package testcases;

import Page.WebDriverEngine;
import org.testng.annotations.Test;

import Base.BaseTest;

public class MeOperation{
    //修改个人信息
    @Test
    public void changeMessage() {
        action.type(et_userName,"ysy");
        action.type(et_userBirthday,"1997.12.3");
    }

    //修改头像
    @Test
    public void changeTmage(){
        action.click(btn_exitUserImage);
        action.click("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.TextView");
    }

    //进入个人作品
    @Test
    public void Mine(){
        action.click("text='个人作品'");
    }

    //进入我的好友
    @Test
    public void Friende(){
        action.click("text='我的好友'");
    }

    //删除好友
    @Test
    public void friendsList(){
        action.click(ll_me_my_friend);
        action.click(btn_friend_delete);
    }

    //添加好友
    @Test
    public void friendsAdd(){
        action.click(ll_me_my_friend);
        action.type(et_add_friend,"admin");
        action.click(btn_add_friend);
    }

    //进入好友申请
    @Test
    public void ApplyFor(){
        action.click("text='好友申请'");
    }

    //进入我的题库
    @Test
    public void MyWork(){
        action.click("text='好友申请'");
    }

    //进入我的下载
    @Test
    public void MyDownload(){
        action.click("text='我的下载'")
    }

    //注销用户
    @Test
    public void delete(){
        DeletRegister();
    }
}