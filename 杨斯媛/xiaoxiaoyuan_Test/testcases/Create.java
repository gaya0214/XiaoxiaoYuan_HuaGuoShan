package testcases;

import org.testng.annotations.Test;

import Base.BaseTest;

public class Creat extends BaseTest{
    //创建
    public void create(){
        action.click(iv_creat);
        action.click("xpath=roup/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]\n");
        action.click(workspace);
    }

    //保存
    public void save(){
        action.click("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup");
        action.click(workspace);
    }
    //清空
    public void clean(){
        action.click("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup");
        action.click(workspace);
    }
    //运行
    public void run(){
        action.click("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup");
        action.click(workspace);
    }
}