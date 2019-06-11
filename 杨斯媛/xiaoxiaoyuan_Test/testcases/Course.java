package testcases;

import org.testng.annotations.Test;

import Base.BaseTest;

public class Course extends BaseTest{
    //进入course
    public void getinto(){
        action.click(iv_tv);
    }
    //查看教程
    public void watch(){
        action.click("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]");
        action.click("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.LinearLayout[1]");
    }
    //暂停教程
    public void pause(){
        action.click(bt_start_pause);
    }
    //退出教程
    public void quit(){
        action.KeyBack();
    }
}