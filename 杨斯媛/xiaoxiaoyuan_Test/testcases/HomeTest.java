package testCase;


import org.testng.annotations.Test;
import com.pages.ElementsFinder;
import io.appium.java_client.android.AndroidDriver;
import utils.Actions;
import org.openqa.selenium.support.PageFactory;
import com.base.BasePrepare;

public class HomeTest extends BasePrepare {

    //进入菜单
    @Test
    public void mainList(){
        action.click("id=iv_spin");
        action.click("id=iv_HomePage");
    }

    //进入GO
    @Test
    public void go(){
        action.click("id=iv_arts");
    }

    //进入CREAT
    @Test
    public void create(){
        web.click("id=iv_creat");
    }

    //进入COURSE
    @Test
    public void course(){
        action.click("id=iv_tv");
    }
}
