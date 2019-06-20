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
        action.click(ll_go);
    }
    //登录
    public void Loginto (){
        action.click(iv_spin);
        action.click(iv_me);
        action.type(usr_name,name);
        action.type(usr_pwd,password);
        action.click(btn_login);
    }
    //登录（信息不完整）
    public void loginNopsd(String et_userEmailOrPhone,String et_userPassword){
        action.click(user_name);
        action.type(username,this.name);
        action.click(btn_login);
    }
}