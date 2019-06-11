package testcases

import pages.Elements;
import io.appium.java_client.android.AndroidDriver;
import utils.Actions;
import org.openqa.selenium.support.PageFactory;


public class SignUp extends BaseTest{
        //注册用户
    @Test
        public void SignUp(String user_name,String user_pwd ){
            action.click(btn_register);
            action.click(user_name);
            action.type(user_name,this.user_name);
            action.click(user_pwd);
            action.type(user.pwd,this.user_pwd);
            action.click(write_pwd);
            action.type(write_pwd,this.write_pwd);
            action.click(btn_register);
        }
}