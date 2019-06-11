package testcases;

import pages.Elements;
import io.appium.java_client.android.AndroidDriver;
import utils.Actions;
import org.openqa.selenium.support.PageFactory;

public class Enter extends Operate{
    public Enter(Android driver,String name,String pwd){
        this.driver=driver;
        action=new Actions(driver);
        action.click(ll_go);
        action.click(list);
        action.click(mine);
        action.type(usr_name,name);
        action.type(usr_pwd,pwd);
        action.click(login_btn);
        action.click(go);
    }
}

