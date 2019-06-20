package testcases;

import com.pages.ElementsFinder;
import io.appium.java_client.android.AndroidDriver;
import utils.Actions;
import org.openqa.selenium.support.PageFactory;
import com.base.BasePrepare;

public class DeletRegister extends BasePrepare{
    //删除用户
    @Test
    public void DeletRegist(){
        action.click(tv_setting);
    }
    //验证删除之后是否还能登录
    @Test
    public void loginTest(){
        action.click("id=iv_spin");
        action.click("id=iv_me");
        action.type("id=usr_name,name");
        action.type("id=usr_pwd,password");
        action.click("id=btn_login");
    }
}