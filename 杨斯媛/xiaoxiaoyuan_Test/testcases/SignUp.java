package testcases

import com.pages.ElementsFinder;
import io.appium.java_client.android.AndroidDriver;
import utils.Actions;
import org.openqa.selenium.support.PageFactory;
import com.base.BasePrepare;


public class SignUp extends BasePrepare{
        //注册用户
        public void SignUp(String user_name,String user_pwd ){
            action.click("id=btn_register");
            action.click("id=user_name");
            action.type("id=user_name",this.user_name);
            action.click("id=user_pwd");
            action.type("id=user_pwd",this.user_pwd);
            action.click("id=write_pwd");
            action.type("id=write_pwd,this.write_pwd);
            action.click("id=btn_register");
        }
}