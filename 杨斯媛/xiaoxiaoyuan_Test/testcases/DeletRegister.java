package testcases;
import pages.Elements;
import io.appium.java_client.android.AndroidDriver;
import utils.Actions;
import org.openqa.selenium.support.PageFactory;

public class DeletRegister extends BaseTest{
    //删除用户
    @Test
    public void DeletRegist(){
        action.click(tv_setting);
    }
    //验证删除之后是否还能登录
    @Test
    public void loginTest(){
        action.click(iv_spin);
        action.click(iv_me);
        action.type(usr_name,name);
        action.type(usr_pwd,password);
        action.click(btn_login);
    }
}