package testcases;

import com.pages.ElementsFinder;
import io.appium.java_client.android.AndroidDriver;
import utils.Actions;
import org.openqa.selenium.support.PageFactory;
import com.base.BasePrepare;

public class Course extends BasePrepare{
    //进入course
    public void getinto(){
        action.click("id=iv_tv");
    }
    //查看教程
    public void watch(){
        action.click("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]");
        action.click("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.LinearLayout[1]");
    }
    //暂停教程
    public void pause(){
        action.click("id=bt_start_pause");
    }
    //退出教程
    //因为界面上没有设置返回键，只能点击手机的返回键
    public void quit(){
        action.KeyBack();
    }
}