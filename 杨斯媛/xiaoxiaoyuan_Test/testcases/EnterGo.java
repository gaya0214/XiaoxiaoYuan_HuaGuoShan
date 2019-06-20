package testcases;

import com.pages.ElementsFinder;
import io.appium.java_client.android.AndroidDriver;
import utils.Actions;
import com.base.BasePrepare;
import org.openqa.selenium.support.PageFactory;

public class Enter extends BasePrepare{
    public Enter(Android driver,String name,String pwd){
        this.driver=driver;
        action=new Actions(driver);
        action.click("id=ll_go");
        action.click("id=list");
        action.click("id=mine");
        action.type("id=usr_name,name");
        action.type("id=usr_pwd,pwd");
        action.click("id=login_btn");
        action.click("id=go");
    }
}

