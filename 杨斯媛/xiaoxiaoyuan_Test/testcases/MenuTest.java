package testcases;

import com.pages.ElementsFinder;
import io.appium.java_client.android.AndroidDriver;
import utils.Actions;
import org.openqa.selenium.support.PageFactory;
import com.base.BasePrepare;

public class Menu extends BaseTest{
    //进入主页
    @Test
    public void HomePage(){
        action.click("id=iv_spin");
        action.click("id=iv_HomePage");
    }
    //进入排行榜
    @Test
    public void charts(){
        action click("id=iv_spin");
        action click("id=iv_charts");
    }
    //进入社区
    @Test
    public void community(){
        action.click("id=iv_spin");
        action.click("id=iv_community");
    }
    //进入用户信息
    @Test
    public void me(){
        action.click("id=iv_spin");
        action.click("id=iv_me");
    }

}