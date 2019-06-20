package testcases;

import com.pages.ElementsFinder;
import io.appium.java_client.android.AndroidDriver;
import utils.Actions;
import org.openqa.selenium.support.PageFactory;
import com.base.BasePrepare;

public class RankListTest extends BasePrpare {
    //进入排行榜
    public void charts(){
        action click("id=iv_spin");
        action click("id=iv_charts");
    }

    //查看天梯榜
    @Test
    public void labberList(){
        action.click("id=iv_spin");
        action.click("id=iv_charts");
        action.click("id=fra_labber");
    }

    //查看好友榜
    public void friendsList(){
        action.click("id=iv_spin");
        action.click("id=iv_charts");
        action.click("id=fra_friends");
    }

}
