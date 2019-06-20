package testcases;

import com.pages.ElementsFinder;
import io.appium.java_client.android.AndroidDriver;
import utils.Actions;
import org.openqa.selenium.support.PageFactory;
import com.base.BasePrepare;

class Login extends BasePrepare{
    public Login(AndroidDriver driver){
        PageFactory.initElement(driver.this);
        action=new Action(driver);
        action.click("id=ll_go");
    }
    //登录
    public void Loginto (){
        action.click("id=iv_spin");
        action.click("id=iv_me");
        action.type("id=usr_name",name);
        action.type("id=usr_pwd",password);
        action.click("id=btn_login");
    }
}